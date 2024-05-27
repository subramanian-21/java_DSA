import java.util.HashMap;
import java.util.Map;
public class Lfu {
    private final int  CAPACITY;
    int size;
    int minFreq;
    Map<Integer, Node> map;
    Map<Integer,DLL> freqMap;
    public Lfu(int capacity){
        this.CAPACITY = capacity;
        this.size = 0;
        this.minFreq = 0;
        this.map = new HashMap<>();
        this.freqMap = new HashMap<>();
    }
    public int get(int key){
        Node node = map.get(key);
        if(node == null){
            return  -1;
        }
        updateNode(node);
        return node.val;
    }
    public  void put(int key,int val){
        if(CAPACITY == 0){
            return;
        }
        if(map.containsKey(key)){
            Node node = map.get(key);
            node.val = val;
            updateNode(node);
        }else{
            size++;
            if(size > CAPACITY){
                DLL nodeList = freqMap.get(minFreq);
                Node prevNode = nodeList.tail.prev;
                map.remove(prevNode.key);
                nodeList.removeNode(prevNode);
                size--;
            }
            Node node = new Node(key, val);
            minFreq = 1;
            map.put(key, node);
            DLL newList = freqMap.getOrDefault(minFreq, new DLL());
            newList.addNode(node);
            freqMap.put(minFreq, newList);
        }

    }
    private void updateNode(Node node){
        int nodeFreq = node.freq;
        DLL nodeList = freqMap.get(nodeFreq);
        nodeList.removeNode(node);
        if(nodeList.listSize == 0 && node.freq == minFreq){
            minFreq++;
        }
        node.freq++;
        DLL newList = freqMap.getOrDefault(node.freq, new DLL());
        newList.addNode(node);
        freqMap.put(node.freq, newList);
    }

    private class Node{
        int key;
        int val;
        int freq;
        Node next;
        Node prev;
        private Node(int key,int val){
            this.key = key;
            this.val = val;
            this.freq = 1;
        }
    }
    private class DLL{
        Node head ;
        Node tail ;
        int listSize;
        private DLL(){
            this.head = new Node(0,0);
            this.tail = new Node(0,0);
            this.listSize = 0;
            head.next = tail;
            tail.prev = head;
        }
        private void addNode(Node node){
            Node nextNode = head.next;
            node.next = nextNode;
            nextNode.prev = node;
            head.next = node;
            node.prev = head;
            listSize++;
        }
        private void removeNode(Node node){
            Node prevNode = node.prev;
            Node nextNode = node.next;
            prevNode.next = nextNode;
            nextNode.prev = prevNode;
            listSize--;
        }
    }
}
