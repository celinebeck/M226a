public class Punto {
    //parametri
    private double x;
    private double y;
    //costruttori
    public Punto()
    {
        this.x = 1.0;
        this.y = 1.0;
    }
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    //metodi
    public double calcolaDistanza(){
       return 0;
    }
    public String determinaQuadrante() {
        if(x>0){
            if(y>0){
                return "Primo quadrante";
            }
            else{
                return "Quarto quadrante";
            }
        }
        else{
            if(y>0){
                return "Secondo quadrante";
            }
            else{
                return "Terzo quadrante";
            }
        }
    }
    //override
    @Override
    public String toString() {
        return "Punto{" + "x=" + x + ", y=" + y + "} " + determinaQuadrante();
    }
}
