import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Создать класс Book, спецификация которого приведена ниже. Определить конструкторы,
 * set- и get- методы и метод toString(). Создать второй класс, агрегирующий массив типа Book,
 * с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные
 * на консоль.
 * Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
 * Найти и вывести:
 * a) список книг заданного автора;
 * b) список книг, выпущенных заданным издательством;
 * c) список книг, выпущенных после заданного года.
 */

public class Main {
    public static void main(String[] args){
        System.out.println("Task 9: ");

        AggregateBook aggregateBook = new AggregateBook();

        System.out.println("1 - author's books, 2 - edition books, 3 - books after a given year, 4 - exit");

        while (true) {
            int i = 0;
            System.out.print("Your choice: ");
            switch (new Scanner(System.in).nextInt()) {

                case 1:
                    aggregateBook.searchAuthor();
                    break;
                case 2:
                    aggregateBook.searchPublisher();
                    break;
                case 3:
                    aggregateBook.searchData();
                    break;
                case 4:
                    i = 1;
                    break;
                default:
                    System.out.println("Неверная команда");
            }
            if (i == 1) break;
        }
        System.out.println("--------------------------------------------------------------------------------------");
    }
}
