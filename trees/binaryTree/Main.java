package trees.binaryTree;



public class Main {
    public static void main(String[] args) {
        AVL tree = new AVL();

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        tree.populate(arr);
        System.out.println(tree.adjacentLevelNode(6));
        tree.display();
     
        System.out.println(tree.balanced());
      }
}
