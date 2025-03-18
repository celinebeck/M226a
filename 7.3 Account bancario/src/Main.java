//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Account ac1 = new Account("AC001", 2000.00);
        Client c1 = new Client("Filippo", ac1);
        c1.addFunds(20.00);
        System.out.println(ac1.getBalance());
        c1.withdrawFunds(2020.00);
    }
}