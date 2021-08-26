package Stock;

import AbstractFactory.Flowers.Flower;
import AbstractFactory.Flowers.FlowerPackaging;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class StockFlowers {
    private List<Flower> flowers = new ArrayList<>();

    private List<StockFlowerPackaging> flowerPackagings = new ArrayList<>();

    public List<Flower> getFlowers() {
        return flowers;
    }

    public List<StockFlowerPackaging> getFlowerPackagings() {
        return flowerPackagings;
    }

    public StockFlowers() {
        Collections.addAll(flowers, new Flower("Rose", 2, 9),
                new Flower("Tulip", 1.4, 11),
                new Flower("Chamomile", 1.2, 20),
                new Flower("Peony", 1.6, 7));

        Collections.addAll(flowerPackagings, new StockFlowerPackaging("craft", 8, 2),
                new StockFlowerPackaging("felt", 11, 3),
                new StockFlowerPackaging("grid", 5, 4));
    }

    public void printflowers() {
        for (Flower flower : flowers)
            System.out.println(flower);
    }

    public void printFlowerPackagings() {
        for (StockFlowerPackaging stockFlowerPackaging : flowerPackagings)
            System.out.println(stockFlowerPackaging);
    }

    // Взятие упаковки для цветов со склада
    public FlowerPackaging takeFlowerPackaging() {
        FlowerPackaging flowerPackaging = new FlowerPackaging("", 0);
        Scanner in = new Scanner(System.in);
        String select = "";
        System.out.println("Choose the package for the FlowerGift: ");
        printFlowerPackagings();
        do {
            select = in.nextLine();
            if (availableFlowerPackagings(select) >= 0) {
                int index = availableFlowerPackagings(select);
                flowerPackaging = new FlowerPackaging(getFlowerPackagings().get(index).getName(),
                        getFlowerPackagings().get(index).getPrice());
                flowerPackagings.get(index).setQuantity(flowerPackagings.get(index).getQuantity() - 1);
            } else
                System.out.println("There is no such packaging, choose another.");
        } while (availableFlowerPackagings(select) < 0);

        return flowerPackaging;
    }

    public List<Flower> takeFlowers() {
        List<Flower> selectFlowers = new ArrayList<>();
        Flower flower;
        Scanner in = new Scanner(System.in);
        String select;
        int selectQuantity;
        do {
            System.out.println("Choose the flowers for the FlowerGift: ");
            printflowers();
            select = in.nextLine();
            if (availableFlower(select) >= 0) {
                int index = availableFlower(select);
                System.out.println("How many " + select + " do you want?");
                do {
                    selectQuantity = parseInt(in.nextLine());
                    if (selectQuantity <= 0 || selectQuantity > flowers.get(index).getQuantity())
                        System.out.println("Invalid input, Try again:");
                } while (selectQuantity <= 0 || selectQuantity > flowers.get(index).getQuantity());
                flower = new Flower(flowers.get(index).getName(), flowers.get(index).getPrice(), selectQuantity);
                flowers.get(index).setQuantity(flowers.get(index).getQuantity() - selectQuantity);
                selectFlowers.add(flower);
                System.out.println("Do you want to \"continue\" the selection or \"buy\"?");
                //NULL
                select = in.nextLine();
            } else
                System.out.println("There are no such flowers, try to choose another.");
        } while (!select.equalsIgnoreCase("buy"));
        return selectFlowers;
    }

    //При нахождении совпадений выводит индекс, в противном случае (-1).
    public int availableFlowerPackagings(String name) {
        for (int i = 0; i < flowerPackagings.size(); i++)
            if (name.equalsIgnoreCase(flowerPackagings.get(i).getName()) && flowerPackagings.get(i).getQuantity() > 0)
                return i;
        return -1;
    }

    // аналогичен availableFlowerPackagings.
    public int availableFlower(String name) {
        for (int i = 0; i < flowers.size(); i++)
            if (name.equalsIgnoreCase(flowers.get(i).getName()) && flowers.get(i).getQuantity() > 0)
                return i;
        return -1;
    }


}
