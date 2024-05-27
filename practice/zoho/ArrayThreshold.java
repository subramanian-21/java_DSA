package zoho;

public class ArrayThreshold {
    public static void main(String[] args) {
        int[] arr = {5,8,10,13,6,2};
         System.out.println(count(arr,3));
         System.out.println(counter(13, 3));
    }

    static int count(int[] arr,int t) {
        int c = 0;

        for (int i = 0; i < arr.length; i++) {
            c+=counter(arr[i], t);
        }
        return c;

    }
    static int counter(int num,int t){
        int c = 0;
        int n = num;
        while (t>0) {
            if (n-t >= 0) {
                n = n-t;
                c++;
            }else{
                t--;
            }
        }
        return c;
    }

}
