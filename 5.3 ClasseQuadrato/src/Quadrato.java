public class Quadrato {
    private int _side;
    // costruttore
    public Quadrato(int side)
    {
        if(side<=0)
        {
            side= 1;
        }
        else{
            _side= side;
        }
    }
    //metodi
    public int getArea()
    {
        return _side*_side;
    }

    public int getPerimeter()
    {
        return _side*4;
    }

    public String getDimension()
    {
    return "Quadrato " + _side + "x" + _side;
    }

    public void draw()
    {
        for(int i= 0; i<_side; i++) {
            for (int j = 0; j < _side; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //override
    @Override
    public String toString(){
        return "Lato quadrato: " + _side;
    }

}
