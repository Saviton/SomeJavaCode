package Stock;


import AbstractFactory.Sweets.SweetPackaging;
import AbstractFactory.Sweets.Sweetness;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class StockSweets {
    private List<Sweetness> Sweetnesss = new ArrayList<>();

    private List<StockSweetPackaging> SweetPackagings = new ArrayList<>();

    public List<Sweetness> getSweetnesss() {
        return Sweetnesss;
    }

    public List<StockSweetPackaging> getSweetPackagings() {
        return SweetPackagings;
    }

    public StockSweets() {
        Collections.addAll(Sweetnesss, new Sweetness("nougat", 2, 9),
                new Sweetness("Chocolate", 1.4, 11),
                new Sweetness("yogurt", 1.2, 20),
                new Sweetness("popsicle", 1.6, 7));

        Collections.addAll(SweetPackagings, new StockSweetPackaging("box", 8, 2),
                new StockSweetPackaging("paper", 11, 3),
                new StockSweetPackaging("grid", 5, 4));
    }

    public void printSweetnesss() {
        for (Sweetness Sweetness : Sweetnesss)
            System.out.println(Sweetness);
    }

    public void printSweetPackagings() {
        for (StockSweetPackaging StockSweetPackaging : SweetPackagings)
            System.out.println(StockSweetPackaging);
    }

    // Взятие упаковки для цветов со склада
    public SweetPackaging takeSweetPackaging() {
        SweetPackaging SweetPackaging = new SweetPackaging("", 0);
        Scanner in = new Scanner(System.in);
        String select = "";
        System.out.println("Choose the package for the SweetnessGift: ");
        printSweetPackagings();
        do {
            select = in.nextLine();
            if (availableSweetPackagings(select) >= 0) {
                int index = availableSweetPackagings(select);
                SweetPackaging = new SweetPackaging(getSweetPackagings().get(index).getName(),
                        getSweetPackagings().get(index).getPrice());
                SweetPackagings.get(index).setQuantity(SweetPackagings.get(index).getQuantity() - 1);
            } else
                System.out.println("There is no such packaging, choose another.");
        } while (availableSweetPackagings(select) < 0);

        return SweetPackaging;
    }

    public List<Sweetness> takeSweetnesss() {
        List<Sweetness> selectSweetnesss = new ArrayList<>();
        Sweetness Sweetness;
        Scanner in = new Scanner(System.in);
        String select;
        int selectQuantity;
        do {
            System.out.println("Choose the Sweetnesss for the SweetnessGift: ");
            printSweetnesss();
            select = in.nextLine();
            if (availableSweetness(select) >= 0) {
                int index = availableSweetness(select);
                System.out.println("How many " + select + " do you want?");
                do {
                    selectQuantity = parseInt(in.nextLine());
                    if (selectQuantity <= 0 || selectQuantity > Sweetnesss.get(index).getQuantity())
                        System.out.println("Invalid input, Try again:");
                } while (selectQuantity <= 0 || selectQuantity > Sweetnesss.get(index).getQuantity());
                Sweetness = new Sweetness(Sweetnesss.get(index).getName(), Sweetnesss.get(index).getPrice(), selectQuantity);
                Sweetnesss.get(index).setQuantity(Sweetnesss.get(index).getQuantity() - selectQuantity);
                selectSweetnesss.add(Sweetness);
                System.out.println("Do you want to \"continue\" the selection or \"buy\"?");
                //NULL
                select = in.nextLine();
            } else
                System.out.println("There are no such Sweetnesses, try to choose another.");
        } while (!select.equalsIgnoreCase("buy"));
        return selectSweetnesss;
    }

    //При нахождении совпадений выводит индекс, в противном случае (-1).
    public int availableSweetPackagings(String name) {
        for (int i = 0; i < SweetPackagings.size(); i++)
            if (name.equalsIgnoreCase(SweetPackagings.get(i).getName()) && SweetPackagings.get(i).getQuantity() > 0)
                return i;
        return -1;
    }

    // аналогичен availableSweetPackagings.
    public int availableSweetness(String name) {
        for (int i = 0; i < Sweetnesss.size(); i++)
            if (name.equalsIgnoreCase(Sweetnesss.get(i).getName()) && Sweetnesss.get(i).getQuantity() > 0)
                return i;
        return -1;
    }

}
