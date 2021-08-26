

import java.util.Scanner;

/**
 * Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
 * различного типа(отдых,экскурсии,лечение,шопинг,круиз и т.д.) для оптимального выбора. Учитывать
 * возможность выбора транспорта,питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public class Main {

    public static void main(String[] args) {
        Suggestion suggestion = new Suggestion();
        Trip trip;
        System.out.println("Menu: 1 - Ready trips; 2 - Sorting by price; 3 - Selection of vouchers; 4 - Exit");

        int toggle = 0;
        while (true) {
            System.out.print("your choice: ");
            int choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1:
                    suggestion.printTrips();
                    break;
                case 2:
                    suggestion.sort();
                    break;
                case 3:
                    trip = suggestion.selection();
                    break;
                case 4:
                    toggle = 1;
                    break;

            }
            if (choice > 4 || choice < 1)
                System.out.println("Invalid input");
            if (toggle == 1) {
                break;
            }
        }
        toggle = 0;
    }


}
