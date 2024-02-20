package LinkedList;

public class Main {
    public static void main(String[] args) {
    LL list = new LL();
    LL l2 = new LL();

    list.insertEnd(1);
    list.insertEnd(3);
    list.insertEnd(5);
    l2.insertEnd(2);
    l2.insertEnd(4);
    l2.insertEnd(6);

    LL l = LL.merge(list, l2);
    l.display();
       list.display();


    }
}
