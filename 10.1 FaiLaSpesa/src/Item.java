public class Item {
    //parametri
    private String name;
    private double price;
    //costruttore
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
    // getter  e setter
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
}
