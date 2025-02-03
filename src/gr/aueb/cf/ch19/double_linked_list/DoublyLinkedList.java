package gr.aueb.cf.ch19.double_linked_list;

public class DoublyLinkedList<T> {

    private Node<T> head = null;
    private Node<T> tail = null;

    public void insertFirst(T t) {
        Node<T> tmp = new Node<>();
        tmp.setItem(t);
        tmp.setPrev(null);
        tmp.setNext(head);

        if (head == null) tail = tmp;
        else head.setPrev(tmp);

        head = tmp;
    }

    public void insertLast(T t) {
        if (head == null) {
            insertFirst(t);
            return;
        }
        Node<T> tmp = new Node<>();
        tmp.setItem(t);
        tmp.setNext(null);
        tmp.setPrev(tail);

        tail.setNext(tmp);
        tail = tmp;
    }
}
