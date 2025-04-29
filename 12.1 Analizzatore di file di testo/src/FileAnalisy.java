import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FileAnalisy {
    //parametri
    private Path file;
    //costruttore
    public FileAnalisy(Path file) {
        this.file = file;
    }
    //get
    public Path getFile() {
        return file;
    }
    //metodi
    public int countWords(){
        int totalWords = 0;
        try {
            List<String> lines = Files.readAllLines(file);
            for (String line : lines) {
                String[] arrTotParole = line.split("[\\s,]+");
                totalWords += arrTotParole.length;
            }
        } catch (IOException ex) {
            System.out.println("Errore nella lettura del file");
        }
        return totalWords;
    }

    public String longestWord(){
        String longestWord = "";
        try {
            List<String> lines = Files.readAllLines(file);
            for (String line : lines) {
                String[] arrTotParole = line.split("[\\s,]+");
                for (String parole : arrTotParole) {
                    if (parole.length() > longestWord.length()) {
                        longestWord = parole;
                    }
                }
            }
        } catch (IOException ex) {
            System.out.println("Errore nella lettura del file");
        }
        return longestWord+ "   " + longestWord.length();
    }

    public Set<String> setWords() {
        Set<String> setWords = new HashSet<>();
        try{
        List<String> lines = Files.readAllLines(file);
        for (String line : lines) {
            String[] arrTotParole = line.split("[\\s,]+");
            for (String parole : arrTotParole) {
                setWords.add(parole);
            }
        }
        }catch (IOException ex) {
            System.out.println("Errore nella lettura del file");
        }
        return setWords;
    }
}
