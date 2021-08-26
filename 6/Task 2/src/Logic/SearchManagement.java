package Logic;

import NoteBook.Notes;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public interface SearchManagement {
    Scanner in = new Scanner(System.in);

    public default boolean SearchByTopic(List<Notes> notes) {
        System.out.println("\n\n");
        System.out.println("*** Поиск заметок по теме ***");
        System.out.println("Введите название темы: ");
        String topic = in.nextLine();
        boolean flag = false;

        for (Notes x : notes) {
            if (topic.equalsIgnoreCase(x.getTopic())) {
                System.out.println(x);
                flag = true;
            }
        }

        if (flag)
            return flag;
        System.out.println("Заметки с такой темой отсутствуют.");
        return flag;

    }

    public default boolean SearchByDate(List<Notes> notes) {
        Pattern DATE_PATTERN = Pattern.compile("^((2000|2400|2800|(19|2[0-9](0[48]|[2468][048]|[13579][26])))-02-29)$"
                + "|^(((19|2[0-9])[0-9]{2})-02-(0[1-9]|1[0-9]|2[0-8]))$"
                + "|^(((19|2[0-9])[0-9]{2})-(0[13578]|10|12)-(0[1-9]|[12][0-9]|3[01]))$"
                + "|^(((19|2[0-9])[0-9]{2})-(0[469]|11)-(0[1-9]|[12][0-9]|30))$");
        System.out.println("\n\n");
        System.out.println("*** Поиск заметок по дате ***");
        System.out.println("Введите дату в формате год-месяц-день: ");
        String date = in.nextLine();

        while (!DATE_PATTERN.matcher(date).matches()) {
            System.out.println("Введите дату в формате год-месяц-день");
            date = in.nextLine();
        }

        LocalDate dateX = LocalDate.parse(date);
        boolean flag = false;

        for (Notes x : notes) {
            if (dateX.isEqual(x.getDate())) {
                System.out.println(x);
                flag = true;
            }
        }

        if (flag)
            return flag;
        System.out.println("Заметки с такой датой отсутствуют.");
        return flag;

    }

    public default boolean SearchByEmail(List<Notes> notes) {
        Pattern EMAIL_PATTERN = Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$");

        System.out.println("\n\n");
        System.out.println("*** Поиск заметок по email ***");
        System.out.println("Введите email: ");
        String email = in.nextLine();

        while (!EMAIL_PATTERN.matcher(email).matches()) {
            System.out.println("Введите email: ");
            email = in.nextLine();
        }

        boolean flag = false;

        for (Notes x : notes) {
            if (email.equalsIgnoreCase(x.getEmail())) {
                System.out.println(x);
                flag = true;
            }
        }

        if (flag)
            return flag;
        System.out.println("Заметки с таким email отсутствуют.");
        return flag;

    }

    public default boolean SearchByMessage(List<Notes> notes) {
        System.out.println("\n\n");
        System.out.println("*** Поиск заметок по сообщению целиком ***");
        System.out.println("Введите сообщение заметки целиком: ");
        String message = in.nextLine();
        boolean flag = false;

        for (Notes x : notes) {
            if (message.equalsIgnoreCase(x.getMessage())) {
                System.out.println(x);
                flag = true;
            }
        }

        if (flag)
            return flag;
        System.out.println("Заметки с таким сообщением отсутствуют.");
        return flag;

    }

    public default boolean SearchByWordInMessage(List<Notes> notes) {
        System.out.println("\n\n");
        System.out.println("*** Поиск заметок по слову в сообщении ***");
        System.out.println("Введите слово: ");
        String word = in.next();
        boolean flag = false;

        for (Notes x : notes) {
            if (x.getMessage().toLowerCase().contains(word.toLowerCase())) {
                System.out.println(x);
                flag = true;
            }
        }

        if (flag)
            return flag;
        System.out.println("Заметки с таким словом в сообщении отсутствуют.");
        return flag;

    }

    public default boolean CombinedSearch(List<Notes> notes) {
        System.out.println("\n\n");
        System.out.println("*** Поиск заметок по теме и сообщению ***");

        System.out.println("Введите название темы: ");
        String topic = in.nextLine();

        System.out.println("Введите сообщение заметки целиком: ");
        String message = in.nextLine();

        boolean flag = false;

        for (Notes x : notes) {
            if (topic.equalsIgnoreCase(x.getTopic()) && message.equalsIgnoreCase(x.getMessage())) {
                System.out.println(x);
                flag = true;
            }
        }

        if (flag)
            return flag;
        System.out.println("Заметки с такой темой  и сообщением одновременно, не существует.");
        return flag;

    }

    public default void Commands(List<Notes> notes) {
        System.out.println("\n\n");
        System.out.println("*** Меню поиска ***");

        System.out.println("Введите комманду для выбора типа поиска: \n" +
                "1 - Поиск по теме\n" +
                "2 - Поиск по дате\n" +
                "3 - Поиск по email\n" +
                "4 - Поиск по сообщению целиком\n" +
                "5 - Поиск по слову в сообщении\n" +
                "6 - Комбинированный поиск(по теме + сообщению заметки)\n");

        switch (new Scanner(System.in).nextInt()) {
            case 1:
                SearchByTopic(notes);
                break;
            case 2:
                SearchByDate(notes);
                break;
            case 3:
                SearchByEmail(notes);
                break;
            case 4:
                SearchByMessage(notes);
                break;
            case 5:
                SearchByWordInMessage(notes);
                break;
            case 6:
                CombinedSearch(notes);
                break;
            default:
                System.out.println("Неверная команда!");

        }

    }


}



