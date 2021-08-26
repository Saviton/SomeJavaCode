package factory.gifts;

import elements.candy.Box;
import elements.candy.Sweet;
import elements.garden.Bouquet;
import elements.garden.Flower;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SweetGift implements Gift {
    private List<Sweet> sweets = new ArrayList<>();
    private Box box;

    public SweetGift() {
        Scanner in = new Scanner(System.in);
        int choice = 1;
        do {
            System.out.println("Введите название конфеты: ");
            String name = in.nextLine();
            boolean result = name.matches("[а-я]+");
            if (result) {
                System.out.println("Введите количество: ");
                int number = Integer.parseInt(in.nextLine());
                sweets.add(new Sweet(name, number));
            } else
                continue;
            System.out.println("Для выхода введите 0, чтобы продолжить введите 1");
            choice = Integer.parseInt(in.nextLine());
        } while (choice != 0);
        box = new Box();
    }

    @Override
    public void print() {
        System.out.println("SweetGift");
        System.out.println(box);
        for (int i = 0; i < sweets.size(); i++) {
            System.out.println(sweets.get(i));
        }
    }
}
