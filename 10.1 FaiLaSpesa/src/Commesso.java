import java.util.ArrayList;

public class Commesso {

    public void faiLaSpesa(ArrayList<Item> listaSpesa, double denaro){
        for(int i = 0; i<listaSpesa.size(); i++){
            Item item = listaSpesa.get(i);
            denaro = denaro - item.getPrice();
            System.out.println(item.getPrice()+"\t\t"+item.getName());
        }
        System.out.println(denaro);
    }
}
