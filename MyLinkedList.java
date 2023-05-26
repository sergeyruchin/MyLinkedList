import java.lang.reflect.Array;
import java.util.Arrays;

public class MyLinkedList {
    private Node head;
    private int size;

    public int getSize() {
        return size;
    }

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

    public void set(int index, int value) throws ArrayIndexOutOfBoundsException {
        int idx = 0;
        Node tmp = this.head;
        if (index == 0) {
            this.head = new Node(value);
            this.head.setNext(tmp);
            size++;
        } else if (index < getSize()) {
            while (tmp.getNext() != null || idx < index) {
                idx++;
                tmp = tmp.getNext();
                if (idx == index - 1) {
                    Node newNode = new Node(value);
                    newNode.setNext(tmp.getNext());
                    tmp.setNext(newNode);
                    size++;
                }
            }
        } else if (index == getSize()) {
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
            }
            tmp.setNext(new Node(value));
            size++;
        } else {
            throw new ArrayIndexOutOfBoundsException();
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
