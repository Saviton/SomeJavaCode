package AbstractFactory.Flowers;

import AbstractFactory.Gift;
import Stock.StockFlowerPackaging;
import Stock.StockFlowers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlowerGift implements Gift {
    List<Flower> flowers = new ArrayList<>();
    FlowerPackaging packaging;

    public FlowerGift() {
        StockFlowers stock = new StockFlowers();
        packaging = stock.takeFlowerPackaging();
        flowers.addAll(stock.takeFlowers());
        this.print();
    }

    @Override
    public void print() {
        System.out.println("************************************************************************************");
        System.out.println("Yours FlowerGift: ");
        if (packaging != null)
            System.out.println(packaging);
        if (flowers != null)
            for (Flower flower : flowers)
                System.out.println(flower);
        System.out.println("************************************************************************************");

    }
}
