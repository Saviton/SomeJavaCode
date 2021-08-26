import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class AggregateBook {
    Book[] books = {new Book("Граф монте кристо", "Дюма", "НоваТел", 1844, 1274, 20, "Твердый"),
            new Book("Капитанская дочка", "Пушкин", "ТипоГраф", 2012, 130, 11, "Твердый"),
            new Book("Три мушкетера", "Дюма", "Мультипринт", 1823, 300, 15, "Мягкий"),
            new Book("Мертвые души", "Гоголь", "Графман", 2014, 410, 17, "Твердый"),
            new Book("Дикая охота короля Стаха", "Короткевич", "ТипоГраф", 2016, 147, 10, "Мягкий")};
    private boolean check = false;

    public void searchAuthor() {
        System.out.print("Enter author: ");
        String name = new Scanner(System.in).nextLine();
        for (Book book : books) {
            if (book.getAuthor().equals(name)) {
                System.out.println(book);
                check = true;
            }
        }
        check(check);
    }
    public void searchData() {
        System.out.print("Enter year: ");
        int year = new Scanner(System.in).nextInt();

        Arrays.sort(books, Comparator.comparing(Book::getYearOfPublication));
        for (Book book : books) {
            if (book.getYearOfPublication() > year) {
                System.out.println(book);
                check = true;
            }

        }
        check(check);
    }

    public void searchPublisher() {
        System.out.print("Enter publisher: ");
        String name = new Scanner(System.in).nextLine();
        for (Book book : books) {
            if (book.getPublisher().equals(name)) {
                System.out.println(book);
                check = true;
            }
        }
        check(check);
    }


    private void check(boolean check) {
        if (!check) {
            System.out.println("Not found");
        }
        this.check = false;
    }
}
