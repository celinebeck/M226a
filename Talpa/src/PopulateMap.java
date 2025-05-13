import java.util.Random;
public class PopulateMap {

    private int randNum() {
        Random r = new Random();
        int randomNum = (int)(Math.random() * 3);
        return randomNum;
    }
    public void insertFrog(Map map){
        String frog = "\uD83D\uDC38";
        int line = randNum();
        int col = randNum();
        String[][] useMAp= map.getMap();
        useMAp[line][col] = frog;
        Map newMap = new Map(useMAp);
        printMap(newMap);
    }
    private void printMap(Map map){
        for(int i = 0; i < map.getMap().length; i++){
            for(int j = 0; j < map.getMap()[i].length; j++){
                System.out.print(map.getMap()[i][j]);
            }
            System.out.println();
        }
    }
    public void CleanCons(){
        for(int i =0; i<10;i++){
            System.out.println("                                                                                                                                                   ");
        }
    }

}

