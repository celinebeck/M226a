import java.util.ArrayList;

public class House {
    //parametri
    private String indirizzo;
    private ArrayList<Room> rooms = new ArrayList<Room>();
    //costruttore
    public House(String indirizzo) {
        this.indirizzo = indirizzo;
    }
    //metodi
    public void addRoom(Room room) {
        rooms.add(room);
    }
    public void printIndirizzo(){
        System.out.println(indirizzo);
    }
    public void printRooms(){
        for(int i = 0; i < rooms.size(); i++){
            System.out.println(rooms.get(i).toString());
        }
    }
    public int totSurface(){
        int tot = 0;
        for(int i = 0; i < rooms.size(); i++){
            Room r = rooms.get(i);
            tot += r.getSuperfice();
        }
        return tot;
    }
}
