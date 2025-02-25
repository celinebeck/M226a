public class Star {
    //parametri
    private String name;
    private long luminosity;
    private long mass;
    private long volume;
    private long age;

    //get set
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setLuminosity(long luminosity){
        this.luminosity = luminosity;
    }
    public long getLuminosity(){
        return luminosity;
    }
    public void setMass(long mass){
        this.mass = mass;
    }
    public long getMass(){
        return mass;
    }
    public void setVolume(long volume){
        this.volume = volume;
    }
    public long getVolume(){
        return volume;
    }
    public void setAge(long age){
        this.age = age;
    }
    public long getAge(){
        return age;
    }

    //costruttore
    public Star(){
        this.name = "sun";
        this.luminosity = 328;
        this.mass = 19885;
        this.volume = 141;
        this.age = 46;
    }

    public Star(String name, long luminosity, long mass, long volume, long age){
        this.name = name;
        this.luminosity = luminosity;
        this.mass = mass;
        this.volume = volume;
        this.age = age;
    }

    //override
    @Override
    public String toString(){
        String ast = "*************************************************************************************************************************";
        return ast + "\n" + name + " cd=" + luminosity + ", m=" + mass + ", V=" + volume + ", Age=" + age + "\n" + ast;
    }
}
