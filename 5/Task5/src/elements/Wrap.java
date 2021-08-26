package elements;

public class Wrap {
    private String name;

    public Wrap(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Упаковка: " + name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
