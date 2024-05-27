package trees.binaryTree;
import java.util.*;
public class BinaryTree {
    private  static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val) {
            this.val = val;
        }  
    }
    private Node root;

    public void populate(Scanner sc){
        System.out.print("Enter Root Node : ");
        int val = sc.nextInt();
        root = new Node(val);
        populate(sc,root);
    }
    private void populate(Scanner sc,Node node){
        char ch;int val;
        System.out.print("Do you want to enter left of "+node.val+" (y/n) : ");
        ch = sc.next().charAt(0);
        if(ch == 'y'){
            System.out.print("Enter Left Node : ");
            val = sc.nextInt();
            node.left = new Node(val);
            populate(sc, node.left);
        }
        System.out.print("Do you want to enter right "+node.val+" (y/n) : ");
        ch = sc.next().charAt(0);
        if(ch == 'y'){
            System.out.print("Enter right Node : ");
            val = sc.nextInt();
            node.right = new Node(val);
            populate(sc, node.right);
        } 
    }

    public void display(){
        display(root,"");
    }
    private void display(Node node, String space){
        if(node == null){
            return ;
        }
        System.out.println(space+node.val);
        display(node.left,space+"\t");
        display(node.right,space+"\t");
    }
    public void display2(){
        display2(root, 0);
    }
    private void display2(Node node,int level){
        if(node == null) return;

        display2(node.right,level+1);
        if(level != 0){
            for (int i = 0; i < level-1; i++) {
                System.out.print("|\t");
            }
            System.out.println("|------->"+node.val);
        }else{
            System.out.println(node.val);
        }

        display2(node.left, level+1);
    }
}
