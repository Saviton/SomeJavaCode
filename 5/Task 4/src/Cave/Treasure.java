package Cave;

import java.util.Random;

import Metal.*;

public class Treasure {
    private static int count = 1;
    private int id = 0;
    private Metal metal;
    private int number;

    // генерация случаайного сокровища
    public void random_treasure() {
        Random rand = new Random();
        Metal[] metal = {new Copper(), new Silver(), new Gold(), new Platinum()};
        this.metal = metal[rand.nextInt(metal.length)];
        this.number = rand.nextInt(90) + 10;
    }

    public Treasure() {
        id = count++;
        this.random_treasure();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Metal getMetal() {
        return metal;
    }

    public void setMetal(Metal metal) {
        this.metal = metal;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getPrice() {
        return number * metal.getPrice();
    }

    @Override
    public String toString() {
        return "Treasure " + id + ": " + number + " " + metal.toString() + " ingots priced at " + this.getPrice() + "$";
    }
}
