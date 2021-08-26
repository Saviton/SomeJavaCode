import java.util.Arrays;
import java.util.Comparator;

class AggregationCustomer {

    Customer[] customers;

    public AggregationCustomer() {
        customers = new Customer[]{new Customer("Иванов", "Иван", "Иванович", "Ивановская", 5782, 5412),
                new Customer("Сергеев", "Сергей", "Сергеевич", "Сергеевичей", 8743, 8536),
                new Customer("Сидоров", "Сидор", "Сидорович", "Сидоровичей", 9649, 9143),
                new Customer("Никитин", "Никита", "Никитович", "Никитова", 6734, 1832),
                new Customer("Алексеев", "Алексей", "Алексеевич", "Алексеева", 5632, 6734)};
    }

    public void sortLastName() {
        Arrays.sort(customers, Comparator.comparing(Customer::getSurname));
        for (Customer a : customers) System.out.println(a);
    }

    public void findCreditCardBetweenNumbers(long start, long end) {

        for (Customer customer : customers) {
            if (customer.getCredit_card() >= start && customer.getCredit_card() <= end)
                System.out.println(customer);
        }
    }
}
