package AbstractFactory.Flowers;

import AbstractFactory.Gift;
import AbstractFactory.GiftFactory;

public class FlowerFactory implements GiftFactory {

    @Override
    public Gift createGift() {
        return new FlowerGift();
    }
}
