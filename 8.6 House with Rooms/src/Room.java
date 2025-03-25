public class Room {
    //parametri
    private String nome;
    private int superfice;
    private RoomType roomType;

    //costruttore
    public Room(String nome, int superfice, RoomType roomType) {
        this.nome = nome;
        this.superfice = superfice;
        this.roomType = roomType;
    }
    public int getSuperfice() {
        return superfice;
    }

    @Override
    public String toString() {
        return "Room{" +
                "nome='" + nome + '\'' +
                ", superfice=" + superfice +
                ", roomType=" + roomType +
                '}';
    }
}
