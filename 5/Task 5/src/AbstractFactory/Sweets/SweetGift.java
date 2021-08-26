package AbstractFactory.Sweets;

import AbstractFactory.Gift;
import Stock.StockSweets;

import java.util.ArrayList;
import java.util.List;

public class SweetGift implements Gift {
    List<Sweetness> sweetnesses = new ArrayList<>();
    SweetPackaging packaging;

    public SweetGift() {
        StockSweets stock = new StockSweets();
        packaging = stock.takeSweetPackaging();
        sweetnesses.addAll(stock.takeSweetnesss());
        this.print();
    }

    @Override
    public void print() {
        System.out.println("************************************************************************************");
        System.out.println("Yours SweetGift: ");
        if (packaging != null)
            System.out.println(packaging);
        if (sweetnesses != null)
            for (Sweetness sweetness : sweetnesses)
                System.out.println(sweetness);
        System.out.println("************************************************************************************");

    }
}
