import java.util.ArrayList;
import java.util.List;

/**
 * There are n kids with candies. You are given an integer array candies, where
 * each candies[i] represents the number of candies the ith kid has, and an
 * integer extraCandies, denoting the number of extra candies that you have.
 * 
 * Return a boolean array result of length n, where result[i] is true if, after
 * giving the ith kid all the extraCandies, they will have the greatest number
 * of candies among all the kids, or false otherwise.
 * 
 * Note that multiple kids can have the greatest number of candies.
 * 
 */
public class Leet1431 {
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,3};
        int ext = 3;
        System.out.println(kidsWithCandies(arr,ext));

    }
     static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
   
        List<Boolean> arr = new ArrayList<>();
        
        for (int i = 0; i < candies.length; i++) {
            boolean bool = true;
            int loc = candies[i]+extraCandies;
            for (int j = 0; j < candies.length; j++) {
                if(loc<candies[j]){
                   bool = false; 
                }
            }
            arr.add(bool);
        }
        return arr;
    }
}
