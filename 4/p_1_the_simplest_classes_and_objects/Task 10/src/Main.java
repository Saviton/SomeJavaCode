import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
 * и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
 * методами. Задать критерии выбора данных и вывести эти данные на консоль.
 * Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 * Найти и вывести:
 * a) список рейсов для заданного пункта назначения;
 * b) список рейсов для заданного дня недели;
 * c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 * <p>
 * String destination, String number, Type type, DepartureTime departureTime
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 10: ");
        Airlines airlines = new Airlines();
        while (true) {
            int i = 10;
            System.out.println("Make a choice");
            System.out.println("1 - searchDestination; 2 - searchWeekday; 3 - searchData; 4 - exit");
            switch (new Scanner(System.in).nextInt()) {
                case 1:
                    airlines.searchDestination();
                    break;
                case 2:
                    airlines.searchWeekday();
                    break;
                case 3:
                    airlines.searchData();
                    break;
                case 4:
                    i = 4;
                    break;
                default:
                    System.out.println("Wrong choice!");
                    break;
            }
            if (i == 4)
                break;
        }
        System.out.println("--------------------------------------------------------------------------------------");
    }
}
