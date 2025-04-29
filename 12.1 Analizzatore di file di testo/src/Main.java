import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        String pathIn = "C:\\DatiAllievo\\M226a\\12.1 Analizzatore di file di testo\\test.txt";
        String pathOut = "C:\\DatiAllievo\\M226a\\12.1 Analizzatore di file di testo\\output.txt";
        Path outputPath = Paths.get(pathOut);
        Path inputPath = Paths.get(pathIn);
        FileAnalisy in = new FileAnalisy(inputPath);
        FileAnalisy out = new FileAnalisy(outputPath);
        int totWords = in.countWords();
        String longestWord = in.longestWord();
        Set<String> allWords = in.setWords();
        try {
            List<String> lines = new ArrayList<>();
            lines.add(totWords+"");
            lines.add(longestWord);
            Files.write(outputPath, lines);
            Files.write(outputPath, allWords, StandardOpenOption.APPEND);
        } catch (IOException ex) {
            System.out.println("Errore scrittura!");
        }
    }
}