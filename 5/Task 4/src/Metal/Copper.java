package Metal;

public class Copper implements Metal {
    private double Price = 4;

    @Override
    public String toString() {
        return "Copper";
    }

    @Override
    public double getPrice() {
        return Price;
    }
}