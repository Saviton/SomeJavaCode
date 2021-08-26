package Metal;

public class Silver implements Metal {
    private double Price = 12;

    @Override
    public String toString() {
        return "Silver";
    }

    @Override
    public double getPrice() {
        return Price;
    }
}
