import java.util.Random;
public class PopulateMap {
    public int randNum() {
        Random r = new Random();
        int randomNum = (int)(Math.random() * 3);
        return randomNum;
    }

    /**
     * Inserisce una rana in una posizione casuale
     * @param map
     */
    public void insertFrog(Map map){
        int line = randNum();
        int col = randNum();
        map.insertFrog(col, line);
        printMap(map);
    }

    public void insertBomb(Map map){
        int line = randNum();
        int col = randNum();
        map.insertBomb(col, line);
        printMap(map);
    }

    /**
     * Crea una mappa vuota
     */
    public void emptyMap (){
        Map emptyMap = new Map();
        printMap(emptyMap);
    }

    /**
     * Stampa la mappa
     * @param map
     */
    private void printMap(Map map){
        for(int i = 0; i < map.getMap().length; i++){
            for(int j = 0; j < map.getMap()[i].length; j++){
                System.out.print(map.getMap()[i][j]);
            }
            System.out.println();
        }
    }

    /**
     * Rispulisce la console
     */
    public void CleanCons(){
        for(int i =0; i<15;i++){
            System.out.println("                                                                                                                                                   ");
        }
    }

}

