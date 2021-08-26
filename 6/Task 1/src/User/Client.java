package User;

import Catalog.Catalog;

import java.util.Scanner;

/**
 * Класс Client, определяет методы:
 * printCatalog - печать всех книг из каталога.
 * searchBook - поиск книги в каталоге.
 */
public interface Client {
    /** Метод вызывающий метод print
     * @param catalog - каталог, для которого вызывается метод print();*/
    default public void printCatalog(Catalog catalog) {
        catalog.print();
    }

    /** Метод для поиска книг по имени
     * @param catalog - каталог по которому проходит поиск*/
    default public void searchBook(Catalog catalog) {
        System.out.println("Введите название книги: ");
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        catalog.searchBook(text);
    }

    /** Метод меню, предназначен для создания меню в котором, пользователь
     * и администратор смогут выбрать команды соответствующие их статусу.*/
   public void menu(Catalog catalog);
}
