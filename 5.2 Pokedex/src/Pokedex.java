public class Pokedex {
    //parametri
    private int dimensione;
    private String colore;
    private String generazione;
    private String regione;
    private int memoria;
    private int batteria;

    //costruttori
    public Pokedex() {
        this.dimensione = 12;
        this.colore = "bianco e rosso";
        this.generazione = "I";
        this.regione = "Kanto";
        this.memoria = 50;
        this.batteria = 50;
    }

    public Pokedex(int dimensione, String colore, String generazione, String regione, int memoria, int batteria) {
        this.dimensione = dimensione;
        this.colore = colore;
        this.generazione = generazione;
        this.regione = regione;
        this.memoria = memoria;
        this.batteria = batteria;
    }

    //metodi
    public void ricaricaPokedex() {
        this.batteria = 100;
    }

    public void espandiMemoria(int addMemoria) {
        this.memoria += addMemoria;
    }

    //override
    @Override
    public String toString() {
        return"---------------------------------------------------------------------------------- \n| Colore      | Dimensione      | Regione    | Generazione | Memoria | Batteria  |\n----------------------------------------------------------------------------------\n| " + this.colore + "      | " + this.dimensione + "      | " + this.regione + "    | " + this.generazione + " | " + this.memoria + " | " + this.batteria + "  |";
    }
}
