package trees.segmentTree;


public class SegmentTree {
    private class Node{
        private int data;
        private int startIndex;
        private int endIndex;
        
        Node left;
        Node right;

        private Node(int start,int end){
            this.startIndex = start;
            this.endIndex = end;
        }
    }
    private Node root;

    public SegmentTree(int[] arr){
        root = createTree(arr,0,arr.length-1);
    }

    private Node createTree(int[] arr, int start , int end){
        if(start == end){
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return  leaf;
        }
        Node node = new Node(start, end);
        int mid = (start + end)/2;

        node.left = createTree(arr, start, mid);
        node.right = createTree(arr, mid+1, end);

        node.data = node.left.data+node.right.data;

        return node;
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
            System.out.println("|------->"+node.data);
        }else{
            System.out.println(node.data);
        }
        display(node.left,level+1);
    }
    public int sum(int start,int end){
        return  sum(root,start,end);
    }

    private int sum(Node node,int start,int end){
        if(node.startIndex >= start && node.endIndex <= end){
            return node.data;
        }else if(node.startIndex > end || node.endIndex <start){
            return 0;
        }else{
           return sum(node.left,start,end) + sum(node.right,start,end);
        }
    }
    public void update(int index,int val){
        root.data = update(root,index, val);
    }
    private int update(Node node,int index,int val){
        if(index >= node.startIndex && index <= node.endIndex){
            if(node.startIndex == index && index == node.endIndex){
                node.data = val;
                return  node.data;
            }else{
                int left = update(node.left,index, val);
                int right = update(node.right,index, val);

                node.data = left+right;

                return node.data;
            }
        }
        return  node.data;
    }
}
