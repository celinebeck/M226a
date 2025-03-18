public class Account {
    //usa alt insert
    //parametri
    private double balance;
    private String accountNumber;
    //costruttore
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //metodi
    public void deposit (double amount) {
        this.balance += amount;
    }

    public void withdraw (double amount) {
        if (this.balance-amount > 0) {
            this.balance -= amount;
            System.out.println("Prelievo accettato, saldo corrente: "+ this.balance);
        }
        else{
            System.out.println("Saldo insufficiente");
        }
    }

    //set e get
    public double getBalance() {
        return this.balance;
    }
    public String getAccountNumber() {
        return this.accountNumber;
    }
}
