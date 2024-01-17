package easy;
public class MaximumAndValue {
    public static void main(String[] args) {
        System.out.println(setMax(new int[] {16,9,6,13}));
    }

    public static int findCount(int[] arr, int mask) {
        int count = 0;
        for (int i : arr) {
            if ((i & mask) == mask) {
                count++;
            }
        }

        return count;
    }
    static int setMax(int[] arr){
        int res = 0;
        int mask = 0;
        for(int i =31 ; i>=0;i--){
            mask = (1<<i) | res;
            int count = findCount(arr, mask);
            if(count>=2){
                res= res|mask;
            }
        }
        return res;
    }
}
