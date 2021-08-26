package Cave;

import java.util.ArrayList;

public class Cave {
    private ArrayList<Treasure> treasures = new ArrayList<>();

    public Cave(int NumberOfTreasure){
        for (int i = 0; i < NumberOfTreasure; i++) {
            treasures.add(new Treasure());
        }
    }

    public ArrayList<Treasure> getTreasures() {
        return treasures;
    }

    public void setTreasures(ArrayList<Treasure> treasures) {
        this.treasures = treasures;
    }

    public void print() {
        for (Treasure treasure : treasures)
            System.out.println(treasure);
    }
}
