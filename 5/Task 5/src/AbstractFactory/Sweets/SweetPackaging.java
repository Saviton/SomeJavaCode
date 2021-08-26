package AbstractFactory.Sweets;

import AbstractFactory.Packaging;

public class SweetPackaging implements Packaging {
    private String name;
    private double price;

    public SweetPackaging(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + ", price: " + price + "$.";
    }
}
