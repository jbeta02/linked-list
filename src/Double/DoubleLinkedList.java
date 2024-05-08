package Double;

public class DoubleLinkedList {

    private DNode head;
    private DNode tail;

    public void insertFirst(int value) {
        DNode node = new DNode(value);

        node.setNext(head);
        node.setPrev(null);

        if (head != null) {
            head.setPrev(node);
        }

        head = node;

        if (tail == null) {
            tail = node;
        }
    }

    public void insertLast(int value) {
        if (tail == null) {
            insertFirst(value);
            return;
        }

        DNode node = new DNode(value);

        node.setNext(null);
        node.setPrev(tail);

        tail.setNext(node);

        tail = node;
    }

    public void insert(int value, int index) {
        if (index == 0) {
            insertFirst(value);
            return;
        }

        DNode node = new DNode(value); // node to add
        DNode temp = head; // scanner node

        for (int i = 0; i < index - 1; i++) {
            temp = temp.getNext();
        }

        if (temp.getNext() == null) {
            insertLast(value);
            return;
        }

        node.setNext(temp.getNext()); // set where new node will point first
        node.setPrev(temp);

        temp.setNext(node); // make curr node point to new node
        temp.getNext().setPrev(node);
    }

    public void deleteFirst() {
        head = head.getNext();
        head.setPrev(null);

        if (head == null) {
            tail = null;
        }
    }

    public void deleteLast() {
        if (head == tail) {
            deleteFirst();
            return;
        }

        tail = tail.getPrev();
        tail.setNext(null);
    }

    public void delete(int index) {
        if (index == 0) {
            deleteFirst();
            return;
        }

        DNode temp = head; // scanner node

        for (int i = 0; i < index - 1; i++) {
            temp = temp.getNext();
        }

        if (temp.getNext() == null) {
            deleteLast();
            return;
        }

        temp.getNext().getNext().setPrev(temp);
        temp.setNext(temp.getNext().getNext());
    }

    public void display() {
        DNode node = head;

        while (node != null) {
            System.out.print(node.getValue() + " -> ");
            node = node.getNext();
        }
        System.out.println("END");
    }
}
