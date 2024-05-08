package Single;
import Single.SNode;

// single linked list
public class LinkedList {
    private SNode head;
    private SNode tail;
    private int size;

    public LinkedList() {
        size = 0;
    }

    public void insertFirst(int value) {
        SNode node = new SNode(value);

        node.setNext(head);
        head = node; // shift head

        if (tail == null) { // in first run tail will be equal to head
            tail = head;
        }

        size++;
    }

    public void insertLast(int value) {
        if (tail == null) {
            insertFirst(value);
            return; // break out of method
        }
        SNode node = new SNode(value);

        tail.setNext(node);
        tail = node; // shift tail
        size++;
    }

    public void insert(int value, int index) {
        if (index == 0) {
            insertFirst(value);
            return;
        }
        if (index == size) {
            insertLast(value);
        }

        SNode node = new SNode(value);
        SNode temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.getNext();
        }

        node.setNext(temp.getNext()); // set where new node will point first
        temp.setNext(node); // make curr node point to new node

        size++;
    }

    private SNode find(int value) {
        SNode temp = head;
        while (head != null) {
            if (temp.getValue() == value) {
                return temp;
            }
            temp = temp.getNext();
        }
        return null;
    }

    private SNode getNode(int index) {
        SNode temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
        }
        return temp;
    }

    public void deleteFirst() {
        head = head.getNext();
        if (head == null) {
            tail = null;
        }
        size--;
    }

    public void deleteLast() {
        if (size <= 1) {
            deleteFirst();
            return;
        }

        SNode prev = getNode(size - 2); // -1 gives index of last, -2 gives index of prev
        tail = prev;

        size--;
    }

    public void delete(int index) {
        if (index == 0) {
            deleteFirst();
            return;
        }
        if (index == size - 1) {
            deleteLast();
            return;
        }

        SNode node = getNode(index -1); // go back an index to then jump over node we want to remove
        node.setNext(node.getNext().getNext());

         size--;
    }

    public void displayValues() {
        SNode temp = head;

        while (temp != null) {
            System.out.print(temp.getValue() + " -> ");
            temp = temp.getNext(); // redefine temp to next node
        }
        System.out.println("END");
    }
}
