public class Auto {
    //parametri
    private String marca;
    private String modello;
    private String colore;
    //get
    public String getMarca(){
        return this.marca;
    }
    public String getModello(){
        return this.modello;
    }
    public String getColore(){
        return this.colore;
    }

    //costruttore
    public Auto(String marca, String modello, String colore) {
        this.marca = marca;
        this.modello = modello;
        this.colore = colore;
    }
    //metodi
    public void cambiaColore(String newColore){
        this.colore = newColore;
    }

}
