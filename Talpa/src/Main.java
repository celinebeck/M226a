import java.util.Timer;
import java.util.TimerTask;
import java.lang.Thread;
import java.lang.InterruptedException;
import java.awt.event.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Timer timerSpownFrog = new Timer();
        PopulateMap populateMap = new PopulateMap();
        int punteggio = 0;
        while(true) {
            Thread.sleep(4000);
                populateMap.CleanCons();
                Map map = new Map();
                populateMap.insertFrog(map);
                String userPos = scanner.nextLine();
                System.out.println(userPos);
                int line = map.getFrogLine();
                int col = map.getFrogCol();
                int tasto = Integer.parseInt(userPos);

                if (tasto >= 1 && tasto <= 9) {
                    int targetLine = (tasto - 1) / 3;  //logica di questa riga presa da chatGPT
                    int targetCol = (tasto - 1) % 3;  //logica di questa riga presa da chatGPT

                    if (line == targetLine && col == targetCol) {
                        populateMap.CleanCons();
                        populateMap.emptyMap();
                        punteggio += 1;
                    }
                    else{
                        System.out.println("Punteggio: ");
                        System.out.println("Gioco terminato.");
                        System.exit(0);
                    }
                }
            }
    }

    public void keyPressed(KeyEvent e) {
        System.out.println("Tasto premuto: " + e.getKeyChar());
        if (e.getKeyChar() == 'q') {
            System.out.println("Gioco terminato.");
        }
    }

    public void keyReleased(KeyEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }
}


