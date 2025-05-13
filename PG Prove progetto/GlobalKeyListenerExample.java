import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;
import org.jnativehook.GlobalScreen;

public class GlobalKeyListenerExample {
    public static void main(String[] args) throws Exception {
        GlobalScreen.registerNativeHook();

        GlobalScreen.addNativeKeyListener(new NativeKeyListener() {
            @Override
            public void nativeKeyPressed(NativeKeyEvent e) {
                System.out.println("Tasto premuto: " + NativeKeyEvent.getKeyText(e.getKeyCode()));
            }

            @Override
            public void nativeKeyReleased(NativeKeyEvent e) {
                // Puoi gestire anche il rilascio dei tasti se necessario
            }

            @Override
            public void nativeKeyTyped(NativeKeyEvent e) {
                // Gestire la digitazione se necessario
            }
        });
    }
}
