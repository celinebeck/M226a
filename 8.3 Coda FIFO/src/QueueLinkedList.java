import java.util.ArrayList;
import java.util.LinkedList;

public class QueueLinkedList {
    //parametri
    private LinkedList<String> list = new LinkedList<>();
    //costruttore
    public QueueLinkedList() {
        this.list = new LinkedList<>();
    }
    //metodi
    public void addList(String value){
        list.add(value);
    }

    public String removeList(){
        if(list.isEmpty()){
            return "Non ce nessuno in coda";
        }
        else{
            list.removeFirst();
            return "Il cliente e stato rimosso";
        }
    }

    public void printList(){
        System.out.println(list);
    }

}
