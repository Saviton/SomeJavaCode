package Catalog;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Catalog {
    /**
     * поле которое является агрегацией класса Book
     */
    private List<Book> books = new ArrayList<Book>();

    /**
     * метод для загрузки каталога из файла
     */
    private void loadCatalog() {

        String path = "Catalog.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            //Считывание первого разделителя.
            br.readLine();
            String s = "";
            while (s != null) {
                Book book = new Book(br.readLine(), br.readLine(), br.readLine());
                books.add(book);
                //считывание разделителя между книгами, и последний System.lineSeparator(), в конце файла
                s = br.readLine();

            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }

    public Catalog() {
        this.loadCatalog();
    }

    /**
     * постраничный просмотр каталога
     */
    public void print() {
        int pageSize = 3;
        int page = 1;
        int lastPage = (int) Math.ceil(books.size() / (double) pageSize);

        System.out.println("books.size: " + books.size() + ", lastPage: " + lastPage);
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println(page + "-я страница: ");
            books.stream().skip((page - 1) * pageSize)
                    .limit(pageSize)
                    .forEach(s -> System.out.println(s));

            System.out.println("1 - следующая, 2 - предыдущая, 3 - выход");
            int choice = parseInt(in.nextLine());
            if (page == 1 && choice == 2) {
                System.out.println("Вы на первой странице, предыдущая отсутствует!");
                continue;
            } else if (page == lastPage && choice == 1) {
                System.out.println("Вы на последней странице, следующая отсутствует!");
                continue;
            }
            if (choice == 1)
                page++;
            else if (choice == 2)
                page--;
            else if (choice == 3)
                return;
        }
    }

    /**
     * Функция для поиска книги, по названию книги
     *
     * @param name - строка, содержащая поисковой запрос.
     */
    public void searchBook(String name) {
        System.out.println("Результаты поиска по запросу: \"" + name + "\":");
        boolean flag = false;
        for (Book book : books) {
            if (book.getName().contains(name)) {
                flag = true;
                System.out.println(book);
            }
        }
        if (flag)
            return;
        else
            System.out.println("По данному запросу, ничего не найдено!");
    }

    public void saveInFile() {
        String path = "C:\\Users\\Anton\\Desktop\\Epam_Course\\epam блок 6\\Task1\\src\\Catalog\\Catalog.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (Book book : books) {
                bw.write(book.toString());
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }


    /**
     * получение всех книг из каталога
     */
    public List<Book> getBooks() {
        return books;
    }
}
