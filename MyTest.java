import     java.util.*;

public class MyTest {
    public static void main(String args[]) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(4);
        myLinkedList.add(45);
        myLinkedList.add(12);

        System.out.println(myLinkedList);
        System.out.println("//=//=//=//=//=//=//=//=//=//=//=//=");
        System.out.println(myLinkedList.get(2));
        myLinkedList.set(0, 555);
        System.out.println(myLinkedList);
        System.out.println("//=//=//=//=//=//=//=//=//=//=//=//=");
        System.out.println(myLinkedList.getSize());
        myLinkedList.set(4, 999);
        System.out.println(myLinkedList);



    }
}
