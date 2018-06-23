package DesignPattern.Iterator;

/**
 * Created by ZJYYY on 2018/6/21.
 */
public class LinkedList implements  Collection{

    Node head = null;
    Node tail = null;
    int size = 0;

    public void add(Object o){
        Node n = new Node(o, null);
        if (head == null) {
            head = n;
            tail = n;
            size++;
        } else {
            tail.setNext(n);
            tail = n;
            size++;
        }

    }

    @Override
    public Iterator iterator() {
        return null;
    }

    public int size() {
        return size;
    }
}

class Node{
    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    private Object data;
    private Node next;
}