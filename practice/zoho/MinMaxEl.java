package zoho;

public class MinMaxEl {
    public static void main(String[] args) {
       int[] arr = {2, 3, 11,13,13, 1, 8, 5, 11};

       minMax(arr);
    }
    static void minMax(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            int el = arr[i];
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < arr.length; j++) {
                if(el < arr[j]){
                    min = Math.min(min, arr[j]);
                }
            }
            if(min != Integer.MAX_VALUE){
                System.out.print(el+"<"+min+", ");
            }else{
                System.out.print(el+", ");
            }
            
        }
    }

}
