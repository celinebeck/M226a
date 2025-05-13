public class Map {
    //parametro
    private String[][] Map;
    //costruttore
    public Map() {
        Map = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Map[i][j] = "\u25A0 ";
            }
        }
    }
    public Map(String[][] map) {
        this.Map = map;
    }
    //getter e setter
    public String[][] getMap() {
        return Map;
    }
    //metodi
    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                s += Map[i][j];
            }
            s += "\n";
        }
        return s;
    }
}
