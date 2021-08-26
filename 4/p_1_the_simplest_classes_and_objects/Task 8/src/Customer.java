class Customer {
    private static int count = 1;
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String adress;
    private long credit_card;
    private long bankAccount;

    public Customer(String surname, String name, String patronymic, String adress, long credit_card, long bankAccount) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.adress = adress;
        this.credit_card = credit_card;
        this.bankAccount = bankAccount;
        id = count++;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public long getCredit_card() {
        return credit_card;
    }

    public void setCredit_card(long credit_card) {
        this.credit_card = credit_card;
    }

    public long getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(long bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String toString() {
        return surname + " " + name + " " + patronymic + "; адрес - " + adress +
                "; credit_card - " + credit_card + "; bank_Account - " + bankAccount;
    }

}
