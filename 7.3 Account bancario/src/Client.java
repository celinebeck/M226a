public class Client {
    //parametri
    private String name;
    private Account account;

    //costruttore
    public Client(String name, Account account){
        this.name = name;
        this.account = account;
    }

    //metodi
    public String getName(){
        return this.name;
    }

    public Account getAccount(){
        return this.account;
    }

    public void addFunds(double amount){
        this.account.deposit(amount);

    }

    public void withdrawFunds(double amount){
        this.account.withdraw(amount);
    }
}
