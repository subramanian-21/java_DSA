public class SecondLargestAndSmallest {

    //find the second largest and the second smallest element of the array;

    public static void main(String[] args) {
        int[]  arr = {1,2,3,4,5,5,6,0,7,7,8,89,99,9,9,978};
        System.out.println(secondLargest(arr));
        System.out.println(secondSmallest(arr));
        System.out.println(1<<16 &16 );
    }

    static int secondLargest(int[] arr ){
        int max1 = 0;
        int max2 = 0;

        if(arr[0] > arr[1]){
            max1 = arr[0];
            max2 = arr[2];
        }
        if(arr.length == 2) return max2;

        for(int i = 2;i<arr.length;i++){
            if(arr[i]>max1){
                max2 = max1;
                max1 = arr[i];
            }else if(arr[i]>max2 && arr[i]<max2){
                max2 = arr[i];
            }
        }
        return max2;
    }
     static int secondSmallest(int[] arr ){
        int min1 = 0;
        int min2 = 0;

        if(arr[0]>arr[1]){
            min2 = arr[0];
            min1 = arr[1];
        }else{
            min1 = arr[0];
            min2 = arr[1];
        }
        if(arr.length == 2) return min2;

        for(int i = 2;i<arr.length;i++){
            if (arr[i]<min1) {
                min2 = min1;
                min1 = arr[i];
            }else if(arr[i]<min2 && arr[i]>min1){
                min2 = arr[i];
            }
        }
        return min2;
    }
    
}
