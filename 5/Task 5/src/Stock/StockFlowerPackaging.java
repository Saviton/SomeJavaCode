package Stock;

import AbstractFactory.Flowers.FlowerPackaging;

public class StockFlowerPackaging extends FlowerPackaging {
    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public StockFlowerPackaging(String name, double price, int quantity) {
        super(name, price);
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return super.toString() + " quantity: " + quantity;
    }
}
