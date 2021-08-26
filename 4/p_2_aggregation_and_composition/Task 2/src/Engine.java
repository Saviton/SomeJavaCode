

public class Engine {

    private boolean performance;
    private final String volume;

    public Engine(String volume) {
        this.volume = volume;
    }

    public void performance(boolean performance) {

        this.performance = performance;
    }

    public String getVolume() {
        return volume;
    }
}
