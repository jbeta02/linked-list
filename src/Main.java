import Single.LinkedList;
import Double.DoubleLinkedList;


public class Main {

    public static void main(String[] args) {
//        LinkedList linkedList = new LinkedList();
//
//        linkedList.insertFirst(0);
//        linkedList.insertFirst(1);
//        linkedList.insertFirst(2);
//        linkedList.insertLast(30);
//
//        linkedList.insert(-1, 1);
//        linkedList.delete(0);
//
//        linkedList.displayValues();

        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();

        doubleLinkedList.insertFirst(2);
        doubleLinkedList.insertFirst(1);
        doubleLinkedList.insertFirst(0);

        doubleLinkedList.delete(1);

        //doubleLinkedList.insert(20, 2);

        doubleLinkedList.display();
    }
}
