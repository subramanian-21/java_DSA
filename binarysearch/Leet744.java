package binarysearch;

public class Leet744 {
    public static void main(String[] args) {
        char[] arr = {'c','f','j'};

        System.out.println(nextGreatestLetter(arr, 'j'));
    }

    static char nextGreatestLetter(char[] letters, char target) {
        if(target>=letters[letters.length-1]) return letters[0];
        int start = 0;
        int end = letters.length -1;

        while (start<=end) {
            int mid = (start+end)/2;

            if(letters[mid]>target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return letters[start];
    }
}
