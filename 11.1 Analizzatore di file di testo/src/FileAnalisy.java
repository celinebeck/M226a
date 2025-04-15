import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

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
    public void countWords(){
        try {
            List<String> lines = Files.readAllLines(file);
            for (String line : lines) {
                line.split("[\\s,]+");
            }
        } catch (IOException ex) {
            System.out.println("Errore nella lettura del file");
        }

    }
}
