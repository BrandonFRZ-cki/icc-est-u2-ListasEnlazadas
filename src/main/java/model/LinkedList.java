package model;

public class LinkedList<T> {
    private Node<T> head;
    private int size = 0;
    private Node<T> tail;

    public LinkedList() {
        this.head = null;
        this.size =0;
    }
    public void appendToTail(T value){
        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }else {
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }

    public void deletByValue(T value){
        if (head == null)
            return;
        if (head.getValue().equals(value)) {
            head = head.getNext();
            size--;
            return;
        }
        Node<T> current = head;
        while (current.getNext()!= null){
            if (current.getNext().getValue().equals(value)) {
                if (current.getNext() == tail){
                    tail = current;
                }
                current.setNext(current.getNext().getNext());
                size--;
                return;
            }
            current = current.getNext();
        }

    }
    public T findByValue(T value ) {
        Node<T> current = head;
        while (current.getNext()!= null){
            if (current.getNext().getValue().equals(value)) {
                current.setNext(current.getNext().getNext());
                size--;

            }
            current = current.getNext();
        }
        return current.getValue();

    }
    public Contact findContactByValue(String name) {
        Node<T> current = head;
        while (current != null) {
            if (current.getValue() instanceof Contact) {
                Contact contact = (Contact) current.getValue();
                if (contact.getName().equals(name)) {
                    return contact; //
                }
            }
            current = current.getNext();
        }
        return null;

    }
    public void print(){
        if (head == null) {
            System.out.println("END");
            return;
        }
        Node<T> current = head;
        while (current.getNext() != null) {
            System.out.print(current.getValue() + " -> ");
            current = current.getNext();
        }
        System.out.println(current.getValue()+ " -> END");
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
