//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        QueueArrayList arr = new QueueArrayList();
        arr.addArray("AAAA");
        arr.addArray("BBBB");
        arr.addArray("CCCC");
        arr.addArray("DDDD");
        QueueLinkedList lis = new QueueLinkedList();
        lis.addList("XXXX");
        lis.addList("YYYY");
        lis.addList("ZZZZ");
        lis.addList("KKKK");
        System.out.println(arr.removeArray());
        System.out.println(lis.removeList());
        arr.printArray();
        lis.printList();
    }
}