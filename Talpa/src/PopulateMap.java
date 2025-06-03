import java.util.Random;
public class PopulateMap {
    public int randNum() {
        Random r = new Random();
        int randomNum = (int)(Math.random() * 3);
        return randomNum;
    }

    /**
     * Inserisce una rana in una posizione casuale
     * @param gameMap
     */
    public void insertFrog(GameMap gameMap){
        int line = randNum();
        int col = randNum();
        gameMap.insertFrog(col, line);
        printMap(gameMap);
    }

    public void insertBomb(GameMap gameMap){
        int line = randNum();
        int col = randNum();
        gameMap.insertBomb(col, line);
        printMap(gameMap);
    }

    /**
     * Crea una mappa vuota
     */
    public void emptyMap (){
        GameMap emptyGameMap = new GameMap();
        printMap(emptyGameMap);
    }

    /**
     * Stampa la mappa
     * @param gameMap
     */
    private void printMap(GameMap gameMap){
        for(int i = 0; i < gameMap.getMap().length; i++){
            for(int j = 0; j < gameMap.getMap()[i].length; j++){
                System.out.print(gameMap.getMap()[i][j]);
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

