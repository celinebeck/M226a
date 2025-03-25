//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Room r1 = new Room("cucina", 22, RoomType.KITCHEN);
        Room r2 = new Room("salotto", 22, RoomType.LIVING_ROOM);
        Room r3 = new Room("bagno", 22, RoomType.BATHROOM);
        House h1 = new House("viavia");
        h1.addRoom(r1);
        h1.addRoom(r2);
        h1.addRoom(r3);
        h1.printIndirizzo();
        h1.printRooms();
        int sup = h1.totSurface();
        System.out.println(sup);
    }
}