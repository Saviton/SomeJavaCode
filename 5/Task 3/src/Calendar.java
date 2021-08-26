import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Calendar {
    private ArrayList<Day> days = new ArrayList<>();

    public void addDay(Day... days) {
        Collections.addAll(this.days, days);
    }

    public void print() {
        for (Day day : days)
            System.out.println(day);
    }

    class Day {
        private LocalDate date;
        private String weekend;

        Day(LocalDate date, String weekend) {
            this.date = date;
            this.weekend = weekend;
        }

        public LocalDate getDate() {
            return date;
        }

        public void setDate(LocalDate date) {
            this.date = date;
        }

        public String getWeekend() {
            return weekend;
        }

        public void setWeekend(String weekend) {
            this.weekend = weekend;
        }

        @Override
        public String toString() {
            return date.toString() + ", " + weekend;
        }
    }
}
