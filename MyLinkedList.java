import java.lang.reflect.Array;
import java.util.Arrays;

public class MyLinkedList {
    private Node head;
    private int size;

    public void add(int value) {
        if (head == null) {
            this.head = new Node(value);
        } else {
            Node temp = head;

            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(new Node(value));
        }
            size++;
    }

    public int get(int index) {
        Node tmp = this.head;
        int idx = 0;
        while(tmp != null) {
             if(idx == index)
                 return tmp.getValue();
             else {
                 tmp = tmp.getNext();
                 idx++;
             }
        }
        throw new IllegalArgumentException();
    }

    public void remove(int index) {
        if (index == 0) {
            head = head.getNext();
            size--;
            return;
        }
        int currentIndex = 0;
        Node tmp = head;

        while(tmp !=  null) {
            if (currentIndex ==  index - 1) {
                tmp.setNext(tmp.getNext().getNext());
                size--;
                return;
            } else {
                tmp = tmp.getNext();
                currentIndex++;
            }
        }
    }

    @Override
    public String toString() {
        int[] result = new int[size];
        Node tmp = this.head;
        int idx = 0;
        while (tmp != null) {
            result[idx++] = tmp.getValue();
            tmp = tmp.getNext();
        }
        return Arrays.toString(result);
    }


    private static class Node {
        private Node next;
        private int value;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
