package binarysearch;
    // given with a set of tree heights and the amount of wood that is needed
    // output the excact point to cut all the tree in which the amount of wood
    // cut out from the tree is minimum  than the all possible maximum
public class CuttingTree {

    public static void main(String[] args) {
        System.out.println(getMinCutSize(new int[]{20,15,10,17}, 8));
    }
    
    static int getCutSize(int[] arr,int mid){
        int woodSize = 0;

        for(int num : arr){
            if(num>mid){
                woodSize = woodSize + (num - mid);
            }
        }
        return woodSize;
    }

    static int getMinCutSize(int[] arr,int s){
        int start = 0;
        int end = 0;
        for(int i:arr){
            end = Math.max(end, i);
        }
        while (start<end) {
            int mid = start + (end - start)/2;
            int out = getCutSize(arr, mid);
            if(out == s || mid == start){
                return mid;
            }else{
                if(out>s){
                    start = mid;
                }else{
                    end = mid;
                }
            }
        }
        return -1;
    }
}
