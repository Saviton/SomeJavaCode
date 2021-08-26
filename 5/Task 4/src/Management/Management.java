package Management;

import Cave.Cave;
import Cave.Treasure;

import java.util.Comparator;

public class Management {
    public static Treasure getMaxPrice(Cave cave) {
        cave.getTreasures().sort((Comparator.comparing(Treasure::getPrice)));
        return cave.getTreasures().get(99);
    }

    public static void finding(Cave cave, double select_price) {
        double sum = 0;

        cave.getTreasures().sort((Comparator.comparing(Treasure::getPrice)));

        //если введеная сумма меньше минимального сокровища, выход из метода
        if (select_price - cave.getTreasures().get(0).getPrice() < 0) {
            System.out.println("Too small amount!");
            return;
        }

        for (int i = 0; i < cave.getTreasures().size(); i++) {
            if (select_price - cave.getTreasures().get(i).getPrice() >= 0) {
                System.out.println(cave.getTreasures().get(i));
                select_price -= cave.getTreasures().get(i).getPrice();
            }
        }
    }
}
