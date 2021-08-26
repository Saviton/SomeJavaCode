package User;

import Catalog.Catalog;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class User implements Client {
    private String nickname;
    private String password;
    private String mail;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public User(String nickname, String password, String mail) {
        this.nickname = nickname;
        this.password = password;
        this.mail = mail;
    }

    @Override
    public void menu(Catalog catalog) {
        System.out.println("Введите:\n" +
                "1 - постраничный просмотр каталога,\n" +
                "2 - поиск книг по имени в каталоге,\n" +
                "3 - Предложить администратору внести книгу в каталог.");
        Scanner in = new Scanner(System.in);
        int chose = parseInt(in.nextLine());
        switch (chose) {
            case 1:
                printCatalog(catalog);
                break;
            case 2:
                searchBook(catalog);
                break;
            case 3:
                //TODO Разобраться в эмейлах, и добавить сюда функцию.
                break;
            default:
                System.out.println("Вы ввели неверную команду!");
        }

    }

    @Override
    public boolean equals(Object o) {
        User user = (User) o;
        if (this.getNickname().equalsIgnoreCase(user.getNickname())) {
            System.out.println("Пользователь с таким именем, уже существует");
            return true;
        }
        if (this.getMail().equalsIgnoreCase(user.getMail())) {
            System.out.println("Пользователь с таким email, уже существует");
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "******************************************************************************"
                + System.lineSeparator() + nickname + System.lineSeparator() + password + System.lineSeparator()
                + mail + System.lineSeparator();
    }
}
