package User;

import Catalog.*;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Admin implements Client {
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

    public Admin(String nickname, String password, String mail) {
        this.nickname = nickname;
        this.password = password;
        this.mail = mail;
    }


    @Override
    public void menu(Catalog catalog) {
        int chose = 4;
        do {
            System.out.println("Введите:\n" +
                    "1 - постраничный просмотр каталога,\n" +
                    "2 - поиск книг по имени в каталоге,\n" +
                    "3 - модифицировать каталог,\n" +
                    "4 - выход.");
            Scanner in = new Scanner(System.in);
            chose = parseInt(in.nextLine());
            switch (chose) {
                case 1:
                    printCatalog(catalog);
                    break;
                case 2:
                    searchBook(catalog);
                    break;
                case 3:
                    management(catalog);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Вы ввели неверную команду!");
            }
        } while (chose != 4);
    }

    public void management(Catalog catalog) {
        System.out.println(" ***Управление каталогом*** ");
        System.out.println("Введите:\n" +
                "1 - для удаления книги из каталога\n" +
                "2 - для добавления книги в каталог\n");
        Scanner in = new Scanner(System.in);
        int chose = parseInt(in.nextLine());
        switch (chose) {
            case 1:
                removeBook(catalog);
                break;
            case 2:
                addBook(catalog);
                break;
            default:
                System.out.println("Вы ввели неверную команду!");
        }

    }

    public void removeBook(Catalog catalog) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название книги");
        String name = in.nextLine();
        System.out.println("Книги с таким названием: ");
        for (Book book : catalog.getBooks()) {
            if (name.equalsIgnoreCase(book.getName()))
                System.out.println(book);
        }
        System.out.println("Введите автора: ");
        String author = in.nextLine();
        for (int i = 0; i < catalog.getBooks().size(); i++) {
            if (catalog.getBooks().get(i).getName().equalsIgnoreCase(name) &&
                    catalog.getBooks().get(i).getAuthor().equalsIgnoreCase(author)) {
                System.out.println("Книга соответствующая описанию: ");
                System.out.println(catalog.getBooks().get(i));
                catalog.getBooks().remove(i);
                System.out.println("успешно удалена!");
                catalog.saveInFile();
                return;
            }
        }

        System.out.println("Книга соответствующая вашим критериям отсутствует в каталоге!");
    }

    public void addBook(Catalog catalog) {
        System.out.println(" ***Интерфейс создания книги: ***");
        System.out.println("Введите название добавляемой книги: ");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println("Введите автора добавляемой книги: ");
        String author = in.nextLine();
        System.out.println("Введите тип добавляемой книги: ");
        String type = in.nextLine();
        Book book = new Book(name, author, type);
        catalog.getBooks().add(book);
        catalog.saveInFile();
    }

    @Override
    public boolean equals(Object o) {
        if (this == null || o == null)
            return false;

        Admin admin = (Admin) o;
        if (this.getNickname().equalsIgnoreCase(admin.getNickname())) {
            System.out.println("Пользователь с таким именем, уже существует");
            return true;
        }
        if (this.getMail().equalsIgnoreCase(admin.getMail())) {
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
