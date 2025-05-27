import java.util.Timer;
import java.lang.Thread;
import java.lang.InterruptedException;
import java.awt.event.*;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Frog {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        PopulateMap populateMap = new PopulateMap();
        System.out.println("Per terminare il gioco premere Q");
        System.out.println("Per evitare la bomba premere invio");
        System.out.println("Scegli una difficolta   1   2   3");
        //selezionare la difficolta
        int difficult = Integer.parseInt(scanner.nextLine());
        if (difficult == 1) {
            difficult = 3000;
        }
        if (difficult == 2) {
            difficult = 2000;
        }
        if (difficult == 3) {
            difficult = 1000;
        }
        int punteggio = 0;
        int bombExists = 0;
        //inizio del gioco
        while (true) {
            Thread.sleep(difficult);
            Map map = new Map();
            populateMap.CleanCons();
            int ranNum = populateMap.randNum();
            //popolare mappa bomba/rana
            if (ranNum == 1) {
                populateMap.insertBomb(map);
                bombExists = 1;
            }
            else {
                populateMap.insertFrog(map);
                bombExists = 0;
            }
            try {
                //richiesta tasto utente
                String userPos = scanner.nextLine();
                int line = map.getFrogLine();
                int col = map.getFrogCol();
                int targetCol = 0;
                int targetLine = 0;
                //opzioni gioco
                if (userPos.equals("r")) {
                    System.out.println("Miglior punteggio: ");
                    System.out.println("Partite giocate: ");
                    System.exit(0);
                }
                if (userPos.equals("q")) {
                    System.out.println("Gioco terminato.");
                    System.exit(0);
                }
                int tasto = Integer.parseInt(userPos);
                //"trasforma" il tasto del utente in una posizione
                if (tasto >= 1 && tasto <= 9) {
                    switch (tasto) {
                        case 1:
                            targetCol = 0;
                            targetLine = 2;
                            break;
                        case 2:
                            targetCol = 1;
                            targetLine = 2;
                            break;
                        case 3:
                            targetCol = 2;
                            targetLine = 2;
                            break;
                        case 4:
                            targetCol = 0;
                            targetLine = 1;
                            break;
                        case 5:
                            targetCol = 1;
                            targetLine = 1;
                            break;
                        case 6:
                            targetCol = 2;
                            targetLine = 1;
                            break;
                        case 7:
                            targetCol = 0;
                            targetLine = 0;
                            break;
                        case 8:
                            targetCol = 1;
                            targetLine = 0;
                            break;
                        case 9:
                            targetCol = 2;
                            targetLine = 0;
                            break;
                    }
                    //condizioni di perdita e di vincita
                    if (line == targetLine && col == targetCol && bombExists == 0) {
                        populateMap.CleanCons();
                        populateMap.emptyMap();
                        punteggio += 1;
                    } else {
                        System.out.println("Punteggio: " + punteggio);
                        System.out.println("Gioco terminato.");
                        System.exit(0);
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Posizione non ammessa!");
            }
            //aumento della velocita
            if (punteggio == 20 || punteggio == 50) {
                difficult -= 150;
            }
        }
    }
}


