import java.time.LocalTime;
import java.util.Scanner;

class Airlines {
    Airline[] airlines;

    Airlines() {
        airlines = new Airline[]{new Airline("Минск", 11, "Ил", "15:00", "Пятница"),
                new Airline("Минск", 3, "Ил", "12:00", "Среда"),
                new Airline("Варшава", 7, "Ил", "10:00", "Четверг"),
                new Airline("Минск", 4, "Боинг", "11:00", "Воскресенье"),
                new Airline("Варшава", 12, "Аэробус", "21:00", "Понедельник")};
    }

    public void searchDestination() {
        System.out.println("Enter destination: ");
        Scanner in = new Scanner(System.in);
        String Destination = in.nextLine();
        for (Airline x : airlines) {
            if (x.getDestination().equalsIgnoreCase(Destination))
                System.out.println(x);
        }
    }

    public void searchWeekday() {
        System.out.println("Enter Weekday: ");
        Scanner in = new Scanner(System.in);
        String Weekday = in.nextLine();
        for (Airline x : airlines) {
            if (x.getDaysOfTheWeek().equalsIgnoreCase(Weekday))
                System.out.println(x);
        }
    }

    public void searchData() {
        System.out.print("Enter weekday: ");
        String nameWeekday = new Scanner(System.in).nextLine();
        System.out.print("Enter localtime(hh:mm): ");
        String nameTime = new Scanner(System.in).nextLine();
        for (Airline x : airlines) {
            if (x.getDaysOfTheWeek().equalsIgnoreCase(nameWeekday)) {
                if (x.getDepartureTime().isAfter(LocalTime.parse(nameTime))) {
                    System.out.println(x);
                }
            }
        }
    }

}
