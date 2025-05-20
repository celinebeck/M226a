import javax.swing.*;
import java.awt.event.*;

public class GameWindow extends JFrame implements KeyListener {

    private boolean running = true;

    public GameWindow() {
        this.setTitle("Gioco con Tastiera");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.addKeyListener(this);
        this.setVisible(true);
    }

    public void startGameLoop() {
        while (running) {
            System.out.println("Gioco in esecuzione...");
            // Qui puoi aggiornare la logica del gioco o muovere oggetti
            try {
                Thread.sleep(500); // Simula ciclo di gioco
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Tasto premuto: " + e.getKeyChar());
        if (e.getKeyChar() == 'q') {
            running = false; // Ferma il gioco se premi "q"
            System.out.println("Gioco terminato.");
            System.exit(0);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}
    @Override
    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        GameWindow game = new GameWindow();
        game.startGameLoop();
    }
}
