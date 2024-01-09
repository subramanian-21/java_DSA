public class SubarrayOfArray {
    public static void main(String[] args) {
        printSubArray(new int[] {1,2,3,4,5});
    }
    static void printSubArray(int[] arr){

        for(int i = 0;i<arr.length;i++){
            String sub = "";
            for(int j = i;j<arr.length;j++){
                sub+=arr[j];
                System.out.println(sub);
            }
        }
    }
}
