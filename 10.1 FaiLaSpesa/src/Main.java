import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double denaro = 50;
        ArrayList<Item> listaSpesa = new ArrayList<>();
        Item i = new Item("shampoo", 7.00);
        listaSpesa.add(i);
        Item i2 = new Item("bagnoschiuma", 3.00);
        listaSpesa.add(i2);
        Item i3 = new Item("tinta", 11.00);
        listaSpesa.add(i3);
        Commesso commesso = new Commesso();
        commesso.faiLaSpesa(listaSpesa, denaro);
    }
}