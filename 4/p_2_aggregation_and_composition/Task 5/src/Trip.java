

import java.util.HashMap;

public class Trip {

    private String type;
    private String transport;
    private boolean food;
    private int numberDays;
    private double price;

    private HashMap<String, Double> types = new HashMap<>();
    private HashMap<String, Double> transports = new HashMap<>();

    public Trip(String type, String transport, boolean food, int numberDays) {

        this.type = type;
        this.transport = transport;
        this.food = food;
        this.numberDays = numberDays;

        types.put("Recreation", 70.0);
        types.put("Excursion", 80.0);
        types.put("Treatment", 90.0);
        types.put("Shopping", 200.0);
        types.put("Cruise", 220.0);

        transports.put("Train", 40.0);
        transports.put("Plane", 120.0);
        transports.put("Bus", 10.0);
        transports.put("Minibus", 15.0);

        price = (types.get(type) * numberDays) + transports.get(transport);
        if (food)
            price += 15 * numberDays;

    }

    public HashMap<String, Double> getTypes() {
        return types;
    }

    public HashMap<String, Double> getTransports() {
        return transports;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public void setNumberDays(int numberDays) {
        this.numberDays = numberDays;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return "Voucher: " + type + "; Transport: " + transport + "; Nutrition: " + food + "; Days: " + numberDays + "; Price: " + price + "$";
    }
}
