import java.util.ArrayList;

public class Magazzino {
    //parametri
    private ArrayList<Prodotto> prodotti = new ArrayList<>();

    //costruttore
    public Magazzino(ArrayList<Prodotto> prodotti) {
        this.prodotti = prodotti;
    }

    public Magazzino() {
        this.prodotti = new ArrayList<Prodotto>();
    }

    //metodi
    public void aggiungiProdotto(Prodotto prodotto) {
        prodotti.add(prodotto);
    }

    public void rimuoviProdotto(Prodotto prodotto) {
        prodotti.remove(prodotto);
    }

    public void cercaProdotto(int codice) {
        int nElementi = prodotti.size();
        for (int i = 0; i < nElementi; i++) {
            Prodotto p = prodotti.get(i);
            if(codice == p.getCodice()){
                System.out.println("Nome:"+p.getNome()+" Codice:"+p.getCodice());
            }
        }
    }

    public float calcolaValoreTotaleMagazzino(){
        int nElementi = prodotti.size();
        float valore = 0f;
        for (int i = 0; i < nElementi; i++) {
            Prodotto p = prodotti.get(i);
            valore = valore + p.getPrezzoUnitario();
        }
        return valore;
    }
    public void visualizzaMagazzino(){
        int nElementi = prodotti.size();
        for (int i = 0; i < nElementi; i++) {
            Prodotto p = prodotti.get(i);
            System.out.println("Nome:"+p.getNome()+" Codice:"+p.getCodice());
        }
    }
}
