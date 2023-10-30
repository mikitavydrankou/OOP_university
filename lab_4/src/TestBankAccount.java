public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount s172763 = new BankAccount();
        s172763.SetBalance(1720.00);
        s172763.deposit(2000.00);
        s172763.withdraw(3180.54);
    }
}


class BankAccount{
    double balance;
    void SetBalance(double SetBalance) {
        balance = SetBalance;
    }
    void deposit(double amount){
        this.balance = balance + amount;
        System.out.println("Wpłacono " + amount + " zł. Aktualne saldo: " + balance + " zł");
    }
    void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            this.balance = balance - amount;
            System.out.println("Wypłacono " + amount + " zł. Aktualne saldo: " + balance + " zł");
        }
    }
}
