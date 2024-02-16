package LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();

        list.insertStart(10);
        list.insertStart(20);
        list.insertStart(30);
        list.insertEnd(1000);
        list.insert(0, 2);
        list.insert(1, 5);
        list.insertStart(30);
        list.insertEnd(1000);
        list.insert(0, 2);
        list.insert(1, 9);
        list.display();
        System.out.println(list.removeEnd());
        System.out.println(list.size());
        System.out.println(list.delete(3));
        list.display();
    }
}
