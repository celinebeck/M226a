public class Map {
    //parametro
    private String[][] Map;
    private int frogLine;
    private int frogCol;
    //costruttore
    public Map() {
        Map = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Map[i][j] = "\u25A0 ";
            }
        }
        this.frogLine = 100;
        this.frogCol = 100;
    }
    public Map(String[][] map) {
        this.Map = map;
    }
    //getter e setter
    public String[][] getMap() {
        return Map;
    }
    public int getFrogLine() {
        return frogLine;
    }
    public int getFrogCol() {
        return frogCol;
    }
    public void setFrogLine(int frogLine) {
         this.frogLine = frogLine;
    }
    public void setFrogCol(int frogCol) {
        this.frogCol = frogCol;
    }
    //metodi
    public void insertFrog(int col, int line) {
        String frog = "\uD83D\uDC38";
        Map[line][col] = frog;
        this.frogCol = col;
        this.frogLine = line;
    }
    public void insertBomb(int col, int line) {
        String bomb = "\uD83D\uDCA3";
        Map[line][col] = bomb;
        this.frogCol = col;
        this.frogLine = line;
    }
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
