package NoteBook;

import Logic.SearchManagement;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.Arrays;
import java.util.Comparator;

import static java.lang.Integer.parseInt;

public class NoteBook implements SearchManagement {
    private String path = "NoteBook.txt";
    List<Notes> notes = new ArrayList<>();

    public NoteBook() {
        this.LoadFromFile();

        notes.sort(Comparator.comparing(Notes::getTopic));
    }

    private void LoadFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            br.readLine();
            String s = "";
            while (s != null) {
                Notes notes0 = new Notes(br.readLine(), br.readLine(), br.readLine(), br.readLine());
                notes.add(notes0);
                s = br.readLine();
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

    }

    private void SaveInFile() {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (Notes x : notes) {
                bw.write(x.toString());
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }

    public void addNotes() {
        Scanner in = new Scanner(System.in);

        Pattern DATE_PATTERN = Pattern.compile("^((2000|2400|2800|(19|2[0-9](0[48]|[2468][048]|[13579][26])))-02-29)$"
                + "|^(((19|2[0-9])[0-9]{2})-02-(0[1-9]|1[0-9]|2[0-8]))$"
                + "|^(((19|2[0-9])[0-9]{2})-(0[13578]|10|12)-(0[1-9]|[12][0-9]|3[01]))$"
                + "|^(((19|2[0-9])[0-9]{2})-(0[469]|11)-(0[1-9]|[12][0-9]|30))$");

        Pattern EMAIL_PATTERN = Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$");

        System.out.println("****************************************************************************");
        System.out.println("Интерфейс добавления записи: ");

        System.out.println("Введите тему:");
        String topic = in.nextLine();

        System.out.println("Введите дату в формате год-месяц-день: ");
        String date = in.nextLine();
        while (!DATE_PATTERN.matcher(date).matches()) {
            System.out.println("Введите дату в формате год-месяц-день");
            date = in.nextLine();
        }

        System.out.println("Введите email: ");
        String email = in.nextLine();
        while (!EMAIL_PATTERN.matcher(email).matches()) {
            System.out.println("Введите email: ");
            email = in.nextLine();
        }

        System.out.println("Введите сообщение: ");
        String message = in.nextLine();

        notes.add(new Notes(topic, date, email, message));

        notes.sort(Comparator.comparing(Notes::getTopic));

        SaveInFile();

    }

    public void print() {
        System.out.println("Заметки:");
        for (Notes x : notes) {
            System.out.print(x);
        }
    }

    public void menu() {
        Scanner in = new Scanner(System.in);
        System.out.println("Меню: ");

        while (true) {

            System.out.println("\n\n");
            System.out.println("1 - меню поиска.\n" +
                    "2 - Вывести заметки.\n" +
                    "3 - Добавление новой записи.\n" +
                    "4 - выход\n");

            switch (new Scanner(System.in).nextInt()) {
                case 1:
                    /** вызов функции меню из интерфейса поиска*/
                    Commands(notes);
                    break;
                case 2:
                    this.print();
                    break;
                case 3:
                    addNotes();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Неверная команда!");

            }
        }
    }
}


