package Metal;

public class Platinum implements Metal {
    private double Price = 62.55;

    @Override
    public String toString() {
        return "Platinum";
    }

    @Override
    public double getPrice() {
        return Price;
    }
}
