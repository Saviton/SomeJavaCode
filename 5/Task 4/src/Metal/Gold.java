package Metal;

public class Gold implements Metal {
    private double Price = 105;

    @Override
    public String toString() {
        return "Gold";
    }

    @Override
    public double getPrice() {
        return Price;
    }
}
