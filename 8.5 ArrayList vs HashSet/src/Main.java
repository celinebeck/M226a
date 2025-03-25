import java.util.ArrayList;
import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        HashSet<Integer> set = new HashSet<Integer>();
        long tempoList =  System.nanoTime();
        for (int i = 0; i < 10000000; i++) {
            int randomNum = (int)(Math.random() * 10000000); // 0 to 100
            list.add(randomNum);
        }
        long tempoSet =  System.nanoTime();
        tempoList = System.nanoTime()-tempoList;
        for (int i = 0; i < 10000000; i++) {
            int randomNum = (int)(Math.random() * 10000000); // 0 to 100
            set.add(randomNum);
        }
        tempoSet = System.nanoTime()-tempoSet;

        long tListSearch = System.nanoTime();
        list.contains(8);
        tListSearch = System.nanoTime()-tListSearch;
        long tSetSearch = System.nanoTime();
        set.contains(8);
        tSetSearch = System.nanoTime()-tSetSearch;
        System.out.println("Tempo creazione set: "+(tempoSet));
        System.out.println("Tempo creazione list: "+tempoList);
        System.out.println("Tempo ricerca list: "+tListSearch);
        System.out.println("Tempo ricerca set: "+tSetSearch);
        System.out.println("Grandezza set: "+set.size());
        System.out.println("Grandezza list: "+list.size());
    }
}