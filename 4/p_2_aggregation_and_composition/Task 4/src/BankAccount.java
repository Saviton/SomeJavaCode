

public class BankAccount {
    private final String numberAccount;
    private double money;
    private boolean lock = false;

    public BankAccount(String numberAccount) {
        this.numberAccount = numberAccount;
    }

    public double getMoney() {
        if (!lock)
            return money;
        else
            return 0;
    }

    public void plusMoney(double money) {
        if (!lock)
            this.money += money;
        else {
            System.out.println("BankAccount is blocked");
        }
    }

    public void disMoney(double money) {
        if (!lock) {
            if (this.money - money < -100) {
                System.out.println("Debt Too High!");
            } else {

                this.money -= money;
                System.out.println("Current balance: " + this.money);
            }
        } else System.out.println("Operation is not possible because account blocked");
    }

    public void setLock(boolean lock) {
        this.lock = lock;
    }

    public boolean getLock() {
        return lock;
    }

    public String getNumberAccount() {
        return numberAccount;
    }

    public String toString() {
        if (!lock)
            return "Bank Account: " + numberAccount + ", Balance: " + money;
        else
            return "Bank Account: " + numberAccount + " blocked";
    }
}
