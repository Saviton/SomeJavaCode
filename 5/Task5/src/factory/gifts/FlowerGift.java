package factory.gifts;

import elements.garden.Bouquet;
import elements.garden.Flower;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlowerGift implements Gift {
    private List<Flower> flowers = new ArrayList<>();
    private Bouquet bouquet;

    public FlowerGift() {
        Scanner in = new Scanner(System.in);
        int choice = 1;
        do {
            System.out.println("Введите название цветка: ");
            String name = in.nextLine();
            boolean result = name.matches("[а-я|А-Я]+");
            if (result) {
                System.out.println("Введите количество: ");
                int number = Integer.parseInt(in.nextLine());
                flowers.add(new Flower(name, number));
            } else
                continue;
            System.out.println("Для выхода введите 0, чтобы продолжить введите 1");
            choice = Integer.parseInt(in.nextLine());
        } while (choice != 0);
        bouquet = new Bouquet();
    }

    @Override
    public void print() {
        System.out.println("FlowerGift: ");
        System.out.println(bouquet);
        for (int i = 0; i < flowers.size(); i++) {
            System.out.println(flowers.get(i));
        }
    }


}
