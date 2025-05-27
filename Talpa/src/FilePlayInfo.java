import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.ArrayList;

public class FilePlayInfo {
    //parametri
    private Path path;
    //costruttore
    public FilePlayInfo() {
        this.path = createPath();
    }
    //get e set
    private Path createPath(){
        String pathStr = Frog.class.getProtectionDomain().getCodeSource().getLocation().getPath()+ "info.txt";
        Path path = Paths.get(pathStr);
        return path;
    }
    //metodi
    public void readHighScore() {
        try {
            List<String> lines = Files.readAllLines(this.path);
            for (String line : lines) {
                String[] arrWords = line.split("[\\s,]+");
                System.out.print(arrWords[0]);
            }
        } catch (IOException ex) {
            System.out.println("Errore");
        }
    }
    public void writeHighScore(int score) {
        List<String> line = new ArrayList<>();
        line.add(""+score);
        try {
            Files.write(this.path,line);
        }
        catch (IOException ex) {
            System.out.println("Errore");
        }
    }
}
