import Catalog.Catalog;
import ClientsDB.ClientsDB;
import User.Admin;
import User.Client;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

/**
 * Система учитывает книги как в электронном, так и в бумажном варианте.
 * Существующие роли: пользователь, администратор.
 * Пользователь может просматривать книги в каталоге книг, осуществлять поиск
 * книг в каталоге.
 * Администратор может модифицировать каталог.
 * При добавлении описания книги в каталог оповещение о ней рассылается на
 * е-таil всем пользователям
 * При просмотре каталога желательно реализовать постраничный просмотр
 * Пользователь может предложить добавить книгу в библиотеку, переслав её
 * администратору на е-mail.
 * Каталог книг хранится в текстовом файле.
 * Данные аутентификации пользователей хранятся в текстовом файле. Пароль
 * не хранится в открытом виде
 */

public class Main {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        ClientsDB clientsDB = new ClientsDB();
        Scanner in = new Scanner(System.in);
        int chose;
        do {
            System.out.println("1 - вход в систему\n" +
                    "2 - регистрация\n" +
                    "3 - выход");
            chose = parseInt(in.nextLine());
            switch (chose) {
                case 1:
                    Client client = clientsDB.signIn();
                    client.menu(catalog);
                    break;
                case 2:
                    clientsDB.registration();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Вы ввели несуществующую команду!");
            }
        } while (chose != 3);
        //Admin admin = new Admin();
        //admin.menu(catalog);
    }
}
