package cesur.unidad6;

public class Node {
    private Object elem;
    private Node Next;

    public Node(Object o) {
        elem = o;
        Next = null;
    }

    public Node(Object elem, Node next) {
        this.elem = elem;
        Next = next;
    }

    public Object getElem() {
        return elem;
    }

    public void setElem(Object elem) {
        this.elem = elem;
    }

    public Node getNext() {
        return Next;
    }

    public void setNext(Node next) {
        Next = next;
    }
}
