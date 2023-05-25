import     java.util.*;

public class MyTest {
    public static void main(String args[]) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(4);
        myLinkedList.add(45);
        myLinkedList.add(12);

        System.out.println(myLinkedList.toString());
        System.out.println(myLinkedList.get(2));
        myLinkedList.remove(2);
        System.out.println(myLinkedList.toString());
    }
}
