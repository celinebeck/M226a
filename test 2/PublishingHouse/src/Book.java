/**
 * @author Celine
 * 1.4.2025
 */
public class Book {
    //parametri
    private String title;
    private String author;
    private String genre;
    private int stock;

    //costruttore
    public Book(String title, String author, String genre, int stock) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.stock = stock;
    }

    //getter e setter
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getGenre() {
        return genre;
    }
    public int getStock() {
        return stock;
    }

    //metodi
    public void addStock(int add){
        this.stock += add;
        System.out.println(this.stock);
    }

    @Override
    public String toString() {
        return "titile: " + title + " author: " + author + " genre: " + genre + " stock: " + stock;
    }
}
