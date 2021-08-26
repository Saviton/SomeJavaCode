

public class Wheel {

    public static int id = 0;
    private final int wheelId;
    private String model;

    private boolean rotating = false;

    public Wheel(String model) {
        this.model = model;
        wheelId = id++;

    }

    public void rotating(boolean rotating) {
        this.rotating = rotating;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String toString() {
        return model + " " + wheelId;
    }
}
