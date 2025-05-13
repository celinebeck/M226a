import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

public class KeyPressExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Intercetta i tasti");
        
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // Non necessario per intercettare i tasti
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Tasto premuto: " + e.getKeyChar());
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // Non necessario per intercettare i tasti
            }
        });
        
        frame.setVisible(true);
    }
}
