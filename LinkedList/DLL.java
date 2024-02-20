package LinkedList;

public class DLL {
    private Node head;
    private Node tail;
    private int size;

    DLL(){
        size = 0;
    }
    public void insertStart(int value){
        Node node = new Node(value);
        node.next = head;
        
        node.prev = null;
        if(head!=null){
            head.prev = node;
        }
        head = node;

        if(tail == null){
            tail = node;
            tail.prev = null;
        }
        size++;
    }
    public void insertEnd(int value){
        if(tail == null){
            insertStart(value);
            return;
        }
        Node node = new Node(value);
        node.prev = tail;
        tail.next = node;
        tail = node;
    }
    public void display(){
        Node temp = head;

        while (temp!=null) {
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void displayReverse(){
        Node temp = tail;
        System.out.print("null");
        while (temp!=null) {
            System.out.print(" <- "+temp.value);
            temp = temp.prev;
        }
        System.out.println();
    }
    private class Node {
        private int value;
        private Node next;
        private Node prev;

        Node(int value){
            this.value = value;
        }
        Node(int value, Node next,Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
        
    }
}
