//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Quadrato q1 = new Quadrato(5);
        System.out.println(q1.toString());
        System.out.println(q1.getArea());
        System.out.println(q1.getPerimeter());
        System.out.println(q1.getDimension());
        q1.draw();
    }
}