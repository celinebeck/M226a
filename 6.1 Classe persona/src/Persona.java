public class Persona {
    //parametri classe
    private String nome;
    private String cognome;
    private int eta;
    //costruttore
    //get e set
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if(nome.length()<3) {
            throw new IllegalArgumentException("Nome non valido. Deve essere lungo almeno 3 caratteri.");
        }
        else{
            this.nome = nome;
        }
    }
    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        if(cognome.length()<3) {
            throw new IllegalArgumentException("Cognome non valido. Deve essere lungo almeno 3 caratteri.");
        }
        else {
            this.cognome = cognome;
        }
    }
    public int getEta() {
        return eta;
    }
    public void setEta(int eta) {
        if(eta<0 || eta>100) {
            throw new IllegalArgumentException("Età non valida. Deve essere compresa tra 0 e 100.");
        }
        else {
            this.eta = eta;
        }
    }
}
