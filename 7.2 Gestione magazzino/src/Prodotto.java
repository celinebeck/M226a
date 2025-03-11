public class Prodotto {
    //parametri
    private String nome;
    private int codice;
    private int quantitaMagazzino;
    private float prezzoUnitario;
    //costruttore
    public Prodotto(String nome, int codice, int quantitaMagazzino, float prezzoUnitario) {
        this.nome = nome;
        this.codice = codice;
        this.quantitaMagazzino = quantitaMagazzino;
        this.prezzoUnitario = prezzoUnitario;
    }
    //metodi
    public void AggiornaQuantita(int quantita) {
        quantitaMagazzino += quantita;
    }

    public float calcolaValoreTotale(){
        return quantitaMagazzino*prezzoUnitario;
    }
}
