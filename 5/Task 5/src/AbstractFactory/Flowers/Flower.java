package AbstractFactory.Flowers;

import AbstractFactory.Item;

public class Flower implements Item {
    private String name;
    private double price;
    private int quantity;

    public Flower(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return quantity + " " + name + ", " + price + "$ per piece.";
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
