import java.util.ArrayList;

public class QueueArrayList {
    //parametri
    private ArrayList<String> array = new ArrayList<>();
    //costruttore
    public QueueArrayList() {
        this.array = new ArrayList<>();
    }
    //metodi
    public void addArray(String value){
        array.add(value);
    }
    public String removeArray(){
        if(array.isEmpty()){
            return "No ce nessuno in coda";
        }
        else{
            array.remove(0);
            return "Il primo cliente e stato rimosso";
        }
    }
    public void printArray(){
        System.out.println(array);
    }


}
