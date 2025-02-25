public class Cerchio {
    //parametri
    private double raggio;
    //costruttori
    public Cerchio(){
        this.raggio = 2;
    }

    public Cerchio(double raggio){
        if(raggio < 0){
            System.out.println("Errore");
        }
        else {
            this.raggio = raggio;
        }
    }
    //metodi
    public double calcolaCirconferenza(){
        return 2*raggio*Math.PI;
    }

    public double calcolaArea(){
        return Math.PI*raggio*raggio;
    }

    //override
    @Override
    public String toString() {
        return "Cerchio circonferenza: " + calcolaCirconferenza() + "Area: " + calcolaArea();
    }
}
