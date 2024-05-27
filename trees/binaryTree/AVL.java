package trees.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class AVL {
    private class Node {
        private int val;
        private int height;
        private Node left;
        private Node right;

        private Node(int val){
            this.val = val;
        }
        
    }
    private Node root;

    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }
    
    public boolean isEmpty(Node node){
        return  node == null;
    }
    public void display(){
        display(root,0);
    }
    private void display(Node node,int level){
        if(node == null){
            return ;
        }
        display(node.right,level+1);
        if(level != 0){
            for(int i =0;i<level-1;i++){
                System.out.print("|\t");
            }
            System.out.println("|------->"+node.val);
        }else{
            System.out.println(node.val);
        }
        display(node.left,level+1);
    }

    public  void insert(int val){
        root = insert(val, root);
    }
    private Node insert(int val,Node node){
        if(node == null){
            return  new Node(val);
        }
        if(val < node.val){
            node.left = insert(val, node.left);
        }
        if(val > node.val){
            node.right = insert(val, node.right);
        }
        node.height = Math.max(height(node.left), height(node.right))+1;
        return rotate(node);
    }

    private Node rotate(Node node){
        if(height(node.left) - height(node.right) > 1){
            if(height(node.left.left) - height(node.left.right) > 0){
                return rightRotate(node);
            }

            if(height(node.left.left) - height(node.left.right) < 0){
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        if(height(node.left) - height(node.right) < -1){
            if(height(node.right.left) - height(node.right.right) < 0){
                return  leftRotate(node);
            }

            if(height(node.right.left) - height(node.right.right) > 0){
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }
    private Node rightRotate(Node p){
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.height = Math.max(height(p.left), height(p.right))+1;
        c.height = Math.max(height(c.left), height(c.right))+1;

        return  c;
    }

    private Node leftRotate(Node p){
        Node c = p.right;
        Node t = c.left;

        c.left = p;
        p.right = t;

        p.height = Math.max(height(p.left), height(p.right))+1;
        c.height = Math.max(height(c.left), height(c.right))+1;

        return  c;
    }

    public void populate(int[] arr){
        for(int i:arr){
            insert(i);
        }
    }
    public void populateSorted(int[] arr){
        populateSorted(arr, 0,arr.length);
    }
    private void populateSorted(int[] arr,int start,int end){
        if(start >= end){
            return;
        }
        int mid = start+(end-start)/2;

        insert(arr[mid]);

        populateSorted(arr, start, mid);
        populateSorted(arr,mid+1,end);
    }

    public boolean balanced(){
        return  isBalanced(root);

    }
    private boolean isBalanced(Node node){
        if(node == null){
            return  true;
        }
        return Math.abs(height(node.left) - height(node.right)) <=1 && isBalanced(node.left) && isBalanced(node.right);

    }

    public int adjacentLevelNode(int n){
        return adjacentLevelNode(root, n);
    }
    private int adjacentLevelNode(Node root,int n){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            if(current.left != null){
                queue.add(current.left);
            }
            if(current.right != null){
                queue.add(current.right);
            }
            if(current.val == n){
                break;
            }
        }
        return  queue.peek().val;
    }



    public AVL(){

    }


}
