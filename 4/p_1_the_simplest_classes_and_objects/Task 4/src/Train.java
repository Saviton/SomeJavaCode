import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class Train {

    private String destination;
    private int number;
    private LocalTime departureTime;

    public Train(String destination, int number, String time) {
        departureTime = LocalTime.parse(time, DateTimeFormatter.ofPattern("HH:mm"));

        this.destination = destination;
        this.number = number;

    }

    public String toString() {
        return destination + ", " + number + ", " + departureTime;
    }

    public String getDestination() {
        return destination;
    }

    public int getNumber() {
        return number;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }
    public static void swap(Train a, Train b)
    {
        Train train = a;
        a=b;
        b=train;
    }
}
