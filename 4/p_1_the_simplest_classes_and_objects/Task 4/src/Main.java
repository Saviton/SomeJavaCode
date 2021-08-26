import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
 * Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов
 * массива по номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен
 * пользователем. Добавьте возможность сортировки массив по пункту назначения, причем поезда с
 * одинаковыми пунктами назначения должны быть упорядочены по времени отправления.
 */

public class Main {
    public static void main(String[] args){
        System.out.println("Task 4: ");
        Train[] trains = {new Train("Lida", 1, "10:00"),
                new Train("Grodno", 29, "18:00"),
                new Train("Minsk", 3, "22:00"),
                new Train("Mogilev", 16, "11:00"),
                new Train("Brest", 4, "13:00")};
        int choice;
        System.out.println("1 - sorting by numbers, 2 - at destination, 3 - information output by number" +
                ", 0 - exit ");
        while (true) {
            System.out.println("make a choice: ");
            Scanner in = new Scanner(System.in);
            choice = in.nextInt();
            if (choice == 0)
                break;
            else if (choice == 1) {
                for (int i = 0; i < trains.length - 1; i++) {
                    for (int j = 0; j < trains.length - i - 1; j++) {
                        if (trains[j].getNumber() > trains[j + 1].getNumber()) {
                            Train x = trains[j];
                            trains[j] = trains[j + 1];
                            trains[j + 1] = x;
                        }
                    }
                }
                for (int i = 0; i < trains.length; i++) {
                    System.out.println(trains[i].toString());
                }
            } else if (choice == 2) {
                Arrays.sort(trains, Comparator.comparing(Train::getDestination)
                        .thenComparing(Train::getDepartureTime));
                for (Train a : trains) System.out.println(a);
            } else if (choice == 3) {
                System.out.println("Enter number train");
                int x = in.nextInt();
                for (Train a : trains)
                    if (x == a.getNumber())
                        System.out.println(a);
            }

        }
        System.out.println("--------------------------------------------------------------------------------------");
    }
}
