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
