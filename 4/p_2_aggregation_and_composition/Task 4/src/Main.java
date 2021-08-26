
/**
 * Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
 * счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
 * всем счетам, имеющим положительный и отрицательный балансы отдельно
 */

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Иван Иванович", new BankAccount("12345678"));
        client.addBankAccount(new BankAccount("11111111"));
        client.addBankAccount(new BankAccount("22222222"));
        client.addBankAccount(new BankAccount("33333333"));
        client.addBankAccount(new BankAccount("44444444"));


        client.addCashSystem("11111111", 50);
        client.addCashSystem("22222222", 70);
        client.addCashSystem("33333333", -20);
        client.addCashSystem("44444444", -15);
        client.addCashSystem("12345678",800);
        //client.locked_unlocked("12345678");
        //client.SearchBankAccount("12345678");
        client.SortBankAccount();
        //client.AllMoney();
        client.Dis_Pos_money();
    }
}
