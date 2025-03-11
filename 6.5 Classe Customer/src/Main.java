//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer("Pippo", "Poppo");
        Customer c2 = new Customer("Checco", "Zalone", 1800);
        c1.showCustomerInfo();
        c2.showCustomerInfo();
    }
}