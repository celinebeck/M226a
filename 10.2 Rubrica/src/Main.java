//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Contact c1 = new Contact("1", "Frango", "Zoccolino", "1111111","frango@icloud.com");
        Contact c2 = new Contact("2", "Checco", "Zalone", "2222222","checco@icloud.com");
        Contact c3 = new Contact("3", "Gio", "Pippo", "2222222","Gio@icloud.com");
        Contact c4 = new Contact("4", "Gio", "Pippo", "2222222","Gio@icloud.com");
        Rubrica r1 = new Rubrica();
        r1.addContact(c1);
        r1.addContact(c2);
        r1.addContact(c3);
        r1.addContact(c4);
        System.out.println("Lista contatti:");
        r1.printContacts();
        System.out.println("Ricerca Pippo:");
        r1.findContactSurname("Pippo");
        System.out.println("Ricerca Gio Pippo:");
        r1.findContactSurnameName("Pippo", "Gio");
        r1.deleteContact("Pippo", "Gio");

    }
}