

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Client {
    public static int id = 0;
    private int ClientId = 0;
    private String FIO = "";
    //private BankAccount bankAccount;
    private ArrayList<BankAccount> bankAccounts = new ArrayList<BankAccount>();

    public Client(String FIO, BankAccount bankAccount) {
        this.FIO = FIO;
        //this.bankAccount = bankAccount;
        this.ClientId = id++;
        bankAccounts.add(bankAccount);
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public void setBankAccounts(ArrayList<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public ArrayList<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    // блокировка/разблокировка счёта
    public void locked_unlocked(String numberBankAccount) {

        for (BankAccount bankAccount : bankAccounts) {
            if (bankAccount.getNumberAccount() == numberBankAccount) {
                if (bankAccount.getLock())
                    System.out.println("bankAccount blocked");
                else
                    System.out.println("bankAccount not blocked");
                System.out.println("To change account status:" +
                        "\n type unlock/block");
                switch (new Scanner(System.in).next()) {
                    case "unlock":
                        bankAccount.setLock(false);
                        System.out.println("The bank account is unlocked");
                        break;
                    case "block":
                        bankAccount.setLock(true);
                        System.out.println("The bank account is blocked");
                        break;
                }
            }
        }
    }

    public void SearchBankAccount(String numberBankAccount) {
        for (BankAccount bankAccount : bankAccounts) {
            if (bankAccount.getNumberAccount() == numberBankAccount) {
                System.out.println(bankAccount);
            } else
                System.out.println(numberBankAccount + " not found");
        }

    }

    public void addBankAccount(BankAccount bankAccount) {
        bankAccounts.add(bankAccount);

    }

    public void addCashSystem(String bankAccount, double sum) {
        for (BankAccount account : bankAccounts) {
            if (bankAccount.equals(account.getNumberAccount())) {
                account.plusMoney(sum);
            }
        }
    }

    public void SortBankAccount() {
        bankAccounts.sort(Comparator.comparing(BankAccount::getNumberAccount));
        for (BankAccount bankAccount : bankAccounts)
            System.out.println(bankAccount);
    }

    public void AllMoney() {
        double sum = 0;
        for (BankAccount bankAccount : bankAccounts)
            sum += bankAccount.getMoney();
        System.out.println("Total amount from all bank accounts: " + sum);

    }

    public void Dis_Pos_money() {
        double positive_sum = 0, negative_sum = 0;

        for (BankAccount bankAccount : bankAccounts) {
            if (bankAccount.getMoney() > 0)
                positive_sum += bankAccount.getMoney();
            else
                negative_sum+=bankAccount.getMoney();
        }
        System.out.println("Positive balance: " + positive_sum);
        System.out.println("Negative balance: " + negative_sum);

    }

}



