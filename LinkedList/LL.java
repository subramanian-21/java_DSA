package LinkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    LL() {
        size = 0;
    }

    public void insertStart(int value) {
        Node node = new Node(value);

        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertEnd(int value) {
        if (tail == null) {
            insertStart(value);
            return;
        }
        Node node = new Node(value);

        tail.next = node;
        tail = node;
        size++;
    }
    public void duplicates(){
        Node  node = head;

        while (node.next != null) {
            if(node.value == node.next.value){
                node.next = node.next.next;
                size--;
            }else{
                node = node.next;
            }
            
        }
        tail=  node;
        tail.next = null;
        
    }
    public static LL merge(LL h1,LL h2){
        Node head1 = h1.head;
        Node head2 = h2.head;

        LL ret = new LL();
        while (head1 != null && head2!=null) {
            if(head1.value < head2.value){
                ret.insertEnd(head1.value);
                head1 = head1.next;
            }else{
                ret.insertEnd(head2.value);
                head2 = head2.next;
            }
        }
        while (head1 != null) {
            ret.insertEnd(head1.value);
            head1 = head1.next;
        }
        while (head2 != null) {
            ret.insertEnd(head2.value);
            head2 = head2.next;
        }
        return ret;
    }

    public void insert(int value, int index) {

        if (index == 0) {
            insertStart(value);
            return;
        }
        if (index == size) {
            insertEnd(value);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }

    public int removeStart(){
        int value = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return value;
    }

    public int removeEnd(){
        int value = tail.value;
        if(size<=1){
            return removeStart();
        }
        Node sLast = getNode(size-2);
        tail = sLast;
        sLast.next = null;
        size--;
        return value;
    }

    public int size(){
        return size;
    }

    public Node getNode(int index){
        Node node = head;

        for(int i = 1;i<=index;i++){
            node = node.next;
        }
        return node;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public int  delete(int index){
        if(index == 0){
            return removeStart();
        }
        if(index == size-1){
            return removeEnd();
        }

        Node preNode = getNode(index-1);
        int value  = preNode.next.value;
        preNode.next = preNode.next.next;
        return value;
    }

    public Node find(int value){
        Node node = head;

        while (node != null) {
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    private class Node {
        private int value;
        private Node next;

        Node(int value) {
            this.value = value;
        }

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }

}