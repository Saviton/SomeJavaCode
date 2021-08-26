package Stock;

import AbstractFactory.Sweets.SweetPackaging;

public class StockSweetPackaging extends SweetPackaging {
    private int quantity;

    public StockSweetPackaging(String name, double price, int quantity) {
        super(name, price);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return super.toString() + " quantity: " + quantity;
    }
}
