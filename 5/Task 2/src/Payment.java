public class Payment {

    public double buy(Item... items) {
        double price = 0;

        for (Item item : items) {
            price += item.getPrice();
        }

        return price;
    }

    public void whole_items(Item... items) {
        int count = 0;
        for (Item item : items) {
            count++;
            System.out.println(count + ": " + item.getName() + " " + item.getPrice() + "$");
        }
    }


    class Item {
        private String name;

        private double price;

        public Item(String itemName, double price) {
            this.name = itemName;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }
}
