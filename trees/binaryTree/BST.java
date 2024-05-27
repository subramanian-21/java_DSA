package trees.binaryTree;

public class BST {
    private class Node{
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value){
            this.value = value;
        }

        public int getValue(){
            return this.value;
        }
    }

    private Node root;

    public BST(){

    }
    public void populate(int[] arr){
        for(int val :arr){
            insert(val);
        }
    }
    public  void populateSorted(int[] arr){
        populateSorted(arr, 0,arr.length);
    }
    public void populateSorted(int[] arr ,int start,int end){
        if(start >= end){
            return;
        }
        int mid =start+(end-start)/2;

        insert(arr[mid]);

        populateSorted(arr, start, mid);
        populateSorted(arr,mid+1,end);
    }

    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }
    public  boolean isEmpty(){
        return root == null;
    }
    public void display(){
        display(root,0);
    }
    private  void display(Node node, int level){
        if(node == null){
            return;
        }
        display(node.right ,level+1);

        if(level != 0){
            for (int i = 0; i < level-1; i++) {
                System.out.print("|\t");
            }
            System.out.println("|------>"+node.value);
        }else{
            System.out.println(node.value);
        }
        display(node.left,level+1);
    }
    public void insert(int value){
       root = insert(value, root);
    }
    private Node insert(int value,Node node){
        if(node == null){
            node = new Node(value);
            return node;
        }

        if(value < node.value){
            node.left = insert(value, node.left);
        }
        if(value > node.value){
            node.right = insert(value, node.right);
        }
        node.height  = Math.max(height(node.left), height(node.right)) + 1;

        return  node;
    }
    public boolean balanced(){
        return  balanced(root);
    }
    private boolean balanced(Node node){
    if(node == null){
        return true;
    }
    return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);

    }

    public void preOrder(){
        preOrder(root);
    }
    public void preOrder(Node node){
        if(node == null){
            return; 
        }
        System.out.print(node.value+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public void inOrder(){
        inOrder(root);
    }
    public void inOrder(Node node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.value+" ");
        inOrder(node.right);
    }
    public void postOrder(){
        inOrder(root);
    }
    public void postOrder(Node node){
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value+" ");

    }

}