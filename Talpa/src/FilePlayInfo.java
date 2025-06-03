import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;

public class FilePlayInfo {
    //parametri
    private Path path;
    private List<String> lines;
    //costruttore
    public FilePlayInfo() {
        this.path = createPath();
        this.lines = getLines();
        List<String> line = new ArrayList<>();
        File f = path.toFile();
        //nel caso in cui il file e vuoto lo riempe con valori che non creano problemi al confronto
        if (f.length() == 0) {
            line.add("0");
            line.add("1");
            try {
                Files.write(this.path,line);
            }
            catch (IOException ex) {
                System.out.println("Errore");
            }
        }
    }
    //get e set

    /**
     *
     * @return il path del file con la classifica
     */
    private Path createPath(){
        Path path = Paths.get("info.txt");
        return path;
    }
    //metodi

    /**
     * legge il punteggio piu alto fatto
     * @return il punteggio piu alto mai fatto
     */
    public String readHighScore() {
        String highScore = "";
        List<String> lines = getLines();
        highScore = lines.get(0);
        return highScore;
    }

    /**
     * confronta i punteggi e sovrascrive quello piu alto
     * @param score
     */
    public void writeHighScore(int score) {
        List<String> line = new ArrayList<>();
        int lastScore = Integer.parseInt(readHighScore());
        int finalScore = 0;
        if (score > lastScore) {
            finalScore = score;
        }
        else{
            finalScore = lastScore;
        }
        lines.set(0,""+finalScore);
        try {
            Files.write(this.path,lines);
        }
        catch (IOException ex) {
            System.out.println("Errore");
        }
    }

    /**
     * legge il totale delle partite fatte
     * @return totale partite fatte
     */
    public String readTotPlay(){
        String play = "";
        play = lines.get(1);
        return play;
    }

    /**
     * incrementa le partite fatte
     */
    public void writeTotPlay() {
        String totplay= readTotPlay();
        int Itotplay = Integer.parseInt(totplay) + 1;
        lines.set(1,""+Itotplay);
        try {
            Files.write(this.path,lines);
        }
        catch (IOException ex) {
            System.out.println("Errore");
        }
    }

    /**
     * legge le linee nel file
     * @return le linee del file
     */
    private List<String> getLines(){
        lines = new ArrayList<>();
        try {
             lines = Files.readAllLines(this.path);
        } catch (IOException ex) {
            lines.add("Errore");
        }
        return lines;
    }
}
