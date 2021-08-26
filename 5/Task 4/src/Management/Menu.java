package Management;

import Cave.Cave;

import java.util.Scanner;

public class Menu {
    public Menu(Cave cave) {
        Scanner in = new Scanner(System.in);

        boolean exit = false;

        do {
            commands();
            switch (new Scanner(System.in).nextInt()) {
                case 1:
                    cave.print();
                    break;
                case 2:
                    System.out.println("Max price:");
                    System.out.println(Management.getMaxPrice(cave));
                    break;
                case 3:
                    System.out.println("Enter price:");
                    double price = in.nextDouble();
                    System.out.println("Treasures for a given amount:");
                    Management.finding(cave, price);
                break;
                case 0:
                    System.out.println("You have successfully quit the program");
                    exit = true;
                    break;
                default:
                    System.out.println("Wrong key");
            }
        } while (!exit);
    }

    public void commands() {
        System.out.println("Menu: enter\n" +
                " 1 - for the print,\n" +
                " 2 - for finding the most expensive treasure,\n" +
                " 3 - for finding the treasure for the entered amount,\n" +
                " 0 - for exit.");
    }

}
