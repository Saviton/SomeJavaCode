package AbstractFactory.Sweets;

import AbstractFactory.Flowers.FlowerGift;
import AbstractFactory.Gift;
import AbstractFactory.GiftFactory;

public class SweetFactory implements GiftFactory {
    @Override
    public Gift createGift() {
        return new SweetGift();
    }

}
