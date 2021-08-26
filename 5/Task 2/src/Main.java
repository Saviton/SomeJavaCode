import java.lang.*;

/**
 * Создать класс Payment c внутренним классом, с помощью объектов кторого можно сформировать покупку
 * из нескольких товаров.
 */

public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment();
        Payment.Item item1 = payment.new Item("Food", 30.0);
        Payment.Item item2 = payment.new Item("Clothes", 400.0);
        Payment.Item item3 = payment.new Item("Laptop", 450.0);

        payment.whole_items(item1, item2, item3);
        System.out.println("Full price = " + payment.buy(item1, item2, item3) + "$");
    }
}
