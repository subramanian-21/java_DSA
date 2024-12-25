import java.util.HashMap;
import java.util.Map;
public class Lru {
    private class Node{
        int key;int value;
        Node prev;Node next;

        private Node(int key,int val) {
            this.key = key;
            this.value = val;
        }
    }
    Node head = new Node(0, 0);
    Node tail = new Node(0, 0);
    private final int CAPACITY; 

    Map<Integer,Node> map;
    public Lru(int capacity){
        map = new HashMap<>();
        head.next = tail;
        tail.prev = head;
        this.CAPACITY = capacity;
    }
    private void removeNode(Node node){
        map.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    private void updateNode(Node node){
        map.put(node.key, node);
        node.next = head.next;
        node.next.prev = node;
        head.next = node;
        node.prev = head;
    }
    public int get(int key){
        if(map.containsKey(key)){
            Node node = map.get(key);
            removeNode(node);
            updateNode(node);
            return node.value;
        }
        return -1;
    }
    public void put(int key,int value){
        if(map.containsKey(key)){
            removeNode(map.get(key));
        }
        if(map.size() > CAPACITY){
            removeNode(tail.prev);
        }
        updateNode(new Node(key,value));
    }
}
