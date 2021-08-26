import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Создать класс календарь с внутренним классом, с помощью объектов которого можно хранить информацию о
 * выходых и праздничных днях.
 */

public class Main {
    public static void main(String[] args) {
        Calendar calendar = new Calendar();

        LocalDate date1 = LocalDate.parse("2020-07-13");
        LocalDate date2 = LocalDate.parse("20200622", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate date3 = LocalDate.parse("2020.03.21", DateTimeFormatter.ofPattern("yyyy.MM.d"));
        LocalDate date4 = LocalDate.parse("2020-12-17");
        LocalDate date5 = LocalDate.parse("2020-11-11");

        Calendar.Day day1 = calendar.new Day(date1, "Праздник");
        Calendar.Day day2 = calendar.new Day(date2, "Выходной");
        Calendar.Day day3 = calendar.new Day(date3, "Праздник");
        Calendar.Day day4 = calendar.new Day(date4, "Выходной");
        Calendar.Day day5 = calendar.new Day(date5, "Праздник");

        calendar.addDay(day1, day2, day3, day4, day5);

        calendar.print();
    }
}
