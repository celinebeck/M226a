import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PublishingManager {
    public static void main(String[] args) {
        Book b1 = new Book("Stella", "Franco", "Romanzo", 15);
        Book b2 = new Book("Cometa", "Bella", "Giallo", 12);
        Book b3 = new Book("Piccolo principe", "idk", "Romanzo", 17);
        Book b4 = new Book("Visconte", "Pippo", "Giallo", 1);

        PublishingHouse pm1 = new PublishingHouse("Mondadori", "Via pippo");
        PublishingHouse pm2 = new PublishingHouse("Feltrinelli", "Via garibaldi");
        pm1.addBook(b1);
        pm1.addBook(b2);
        pm1.addBook(b3);
        pm1.addBook(b4);
        pm1.removeBook(b4);
        System.out.print("Aggiunta Stock: ");
        b1.addStock(12);
        pm2.addBook(b4);
        System.out.println("Case presenti: ");
        System.out.println(pm1.toString());
        System.out.println(pm2.toString());
        System.out.println("Stampa Libro: ");
        System.out.println(b1.toString());
        System.out.println("Libri per genere: ");
        pm1.printBooks("Romanzo");
        System.out.println("Conta libri: ");
        System.out.println(pm1.countBooks());

    }
}