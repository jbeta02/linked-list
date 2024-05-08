package Single;

public class SNode {

    private int value;
    private SNode next;

    public SNode(int value) {
        this.value = value;
    }

    public SNode(int value, SNode next) {
        this.value = value;
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public SNode getNext() {
        return next;
    }

    public void setNext(SNode next) {
        this.next = next;
    }
}
