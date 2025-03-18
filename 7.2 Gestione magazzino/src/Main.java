//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Prodotto p1 = new Prodotto("Laptop", 101, 50, 899.99f);
        Prodotto p2  = new Prodotto("Smartphone", 102, 150, 599.49f);
        Prodotto p3  = new Prodotto("Cuffie Wireless", 103, 200, 129.99f);
        Prodotto p4  = new Prodotto("Tablet", 104, 75, 349.99f);
        Prodotto p5  = new Prodotto("Mouse Gaming", 105, 120, 45.99f);
        Magazzino magazzino = new Magazzino();
        magazzino.aggiungiProdotto(p1);
        magazzino.aggiungiProdotto(p2);
        magazzino.aggiungiProdotto(p3);
        magazzino.aggiungiProdotto(p4);
        magazzino.aggiungiProdotto(p5);
        magazzino.rimuoviProdotto(p2);
        magazzino.cercaProdotto(101);
        float valore = magazzino.calcolaValoreTotaleMagazzino();
        System.out.println(valore);
        magazzino.visualizzaMagazzino();
    }
}