//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Auto a1 = new Auto("nissan", "skyline", "viola");
        Persona p1 = new Persona("Giulio", a1);
        Persona p2 = new Persona("Franco");
        a1.cambiaColore("Nero");
        p1.getAuto();
    }
}