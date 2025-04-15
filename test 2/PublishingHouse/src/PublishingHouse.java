import java.util.ArrayList;
/**
 * @author Celine
 * 1.4.2025
 */
public class PublishingHouse {
    //parametri
    private String name;
    private String address;
    private ArrayList<Book> books = new ArrayList<Book>();

    //costruttore
    public PublishingHouse(String name, String address) {
        this.name = name;
        this.address = address;
    }

    //metodi
    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
        if(books.contains(book)){
            System.out.println(book.getTitle()+" non e stato rimosso");
        }
        else{
            System.out.println(book.getTitle()+" e stato rimosso");
        }
    }

    public void printBooks(String genre) {
        for (Book book : books) {
            if (book.getGenre().equals(genre)) {
                System.out.println(book.toString());
            }
        }
    }

    /**
     *
     * @return la somma di tutti i libri presenti nella casa
     */
    public int countBooks() {
        int count = 0;
        for (Book book : books) {
            count += book.getStock();
        }
        return count;
    }

    @Override
    public String toString() {
        return "PublishingHouse{" + "name=" + name + ", address=" + address + '}';
    }

}
