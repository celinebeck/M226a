public class Persona {
    //parametri
    private String nome;
    private Auto auto;
    //costruttore
    public Persona(String nome, Auto auto) {
        this.nome = nome;
        this.auto = auto;
    }
    public Persona(String nome) {
        this.nome = nome;
        this.auto = null;
        System.out.println(nome + " non dispone di nessuna auto");
    }
    //metodi
    public void getAuto(){
        String str = "Marca: " + auto.getMarca() + " Modello: " + auto.getModello() +" Marca: " + auto.getColore();
        System.out.println(str);
    }
}
