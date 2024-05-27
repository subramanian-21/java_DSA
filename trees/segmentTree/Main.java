package trees.segmentTree;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        SegmentTree tree = new SegmentTree(arr);
        tree.display();
        tree.update(2, 20);

        tree.display();
    }
}
