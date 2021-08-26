package factory;

import factory.gifts.FlowerGift;
import factory.gifts.Gift;
import factory.gifts.SweetGift;

public class Factory {
    public Gift createGift(String typeOfGift) {
        switch (typeOfGift) {
            case "Flower": return new FlowerGift();
            case "Sweet": return new SweetGift();
            default: return null;
        }
    }

}

