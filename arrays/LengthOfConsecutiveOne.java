public class LengthOfConsecutiveOne {
    //find the length of the consecutive ones in  a binary representation of a nnumber
    public static void main(String[] args) {
        System.out.println(findConsecutive(110));
    }
    static boolean isConsecutivePresent(int n){
        if((n &(n<<1)) !=0){
            return true;
        }
        return false;
    }

    static int findConsecutive(int n){

        boolean isPresent = true;
        int count = 0;
        while (isPresent) {
          isPresent = isConsecutivePresent(n);
          n= n & n<<1;
          if(isPresent){
            count++;
          }  
        }

        return count;
    }
}
