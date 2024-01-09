package sort;
    //Missing Number in an array from 0-n

    //cyclic sort
public class Leet268 {
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[] {0,2,1,4,3}));
    }
    static int missingNumber(int[] arr){
        int i =0;
        while(i<arr.length){
            int c = arr[i];

            if(arr[i]<arr.length && arr[i] != arr[c]){
                swap(arr, i, c);
            }else{
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j){
                return j;
            }
        }
        return arr.length;
    }
    static void swap(int[] arr, int i, int c){
        int temp = arr[i];
        arr[i] = arr[c];
        arr[c] = temp;
    }
}
