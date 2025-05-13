import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        Timer timerSpownFrog = new Timer();
        PopulateMap populateMap = new PopulateMap();
        ClearCons clearCon = new ClearCons();
        TimerTask taskSpownFrog= new TimerTask() {
            public void run() {
                populateMap.CleanCons();
                Map map = new Map();
                populateMap.insertFrog(map);
            }
        };
        timerSpownFrog.schedule(taskSpownFrog, 0, 4000);
    }
}

