

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;

public class Suggestion {
    private ArrayList<Trip> trips = new ArrayList<>();

    public Suggestion() {

        trips.add(new Trip("Excursion", "Bus", false, 7));
        trips.add(new Trip("Treatment", "Plane", false, 11));
        trips.add(new Trip("Cruise", "Train", true, 12));
        trips.add(new Trip("Shopping", "Minibus", false, 1));
        trips.add(new Trip("Cruise", "Plane", true, 7));

    }

    public void printTrips() {
        int count = 0;
        for (Trip trip : trips) {
            count++;
            System.out.println(count + ") " + trip);
        }
        count = 0;
    }

    public Trip selection() {
        System.out.println("Ready options: ");
        printTrips();
        System.out.print("Select a package number: ");
        int number = new Scanner(System.in).nextInt();
        if (number > trips.size() || number < 1) {
            System.out.println("Invalid input");
        } else {
            System.out.println("To confirm the purchase, enter - 1; Change of parameters - 2; Cancel - 3");
            System.out.print("Make a choice: ");
            int choice = new Scanner(System.in).nextInt();
            if (choice == 1) {
                System.out.println("You purchased:\n" + trips.get(number - 1));
                return trips.get(number - 1);
            } else if (choice == 2) {
                Trip trip = editor(trips.get(number - 1));
                if (trip != null) {
                    System.out.println("You purchased:\n" + trip);
                    return trip;
                } else {
                    System.out.println("Operation canceled");
                }
            } else if (choice == 3) {
                System.out.println("Operation canceled");
                return null;
            } else {
                System.out.println("Invalid input");
            }
        }
        return null;
    }

    private Trip editor(Trip trip) {
        Trip editTrip = trip;
        int toggle = 0;
        while (true) {

            System.out.println("1 - type voucher; 2 - Transport; 3 - Nutrition; 4 - Number of days; 5  -Save; 6 - Cancel;");
            System.out.print("make a choice: ");
            boolean check = false;

            switch (new Scanner(System.in).nextInt()) {
                case 1:
                    for (Map.Entry<String, Double> entry : trip.getTypes().entrySet()) {
                        String view = entry.getKey();
                        System.out.println(view);
                    }
                    System.out.print("Enter the type of voucher: ");
                    String type = new Scanner(System.in).nextLine();

                    for (Map.Entry<String, Double> entry : trip.getTypes().entrySet()) {
                        if (!type.equalsIgnoreCase(entry.getKey())) {
                            check = false;
                        } else {
                            editTrip.setType(type);
                            check = true;
                        }
                    }
                    if (!check) {
                        System.out.println("Invalid input");
                    }
                    check = false;
                    break;
                case 2:
                    for (Map.Entry<String, Double> entry : trip.getTransports().entrySet()) {
                        String transport = entry.getKey();
                        System.out.println(transport);
                    }
                    System.out.print("Enter transport: ");
                    String transport = new Scanner(System.in).nextLine();

                    for (Map.Entry<String, Double> entry : trip.getTransports().entrySet()) {
                        if (!transport.equalsIgnoreCase(entry.getKey())) {
                            check = false;
                        } else {
                            editTrip.setTransport(transport);
                            check = true;
                        }
                    }
                    if (!check) {
                        System.out.println("Invalid input");
                    }
                    check = false;
                    break;

                case 3:
                    System.out.println("Enter true or false: ");
                    editTrip.setFood(new Scanner(System.in).nextBoolean());
                    break;
                case 4:
                    System.out.print("Enter the number of days: ");
                    int number = new Scanner(System.in).nextInt();
                    if (number < 1) {
                        System.out.println("Invalid input");
                    } else {
                        editTrip.setNumberDays(number);
                    }
                    break;
                case 5:
                    return editTrip;
                case 6:
                    editTrip = trip;
                    toggle = 1;
                    break;
            }
            if (toggle == 1) {
                break;
            }
        }
        toggle = 0;
        return null;
    }

    public void sort() {
        trips.sort(Comparator.comparing(Trip::getPrice).reversed());
        for (Trip trip : trips)
            System.out.println(trip);
    }
}
