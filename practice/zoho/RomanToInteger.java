package zoho;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println();
    }
    static int solve(String roman){
        int sum = 0;

        HashMap<Character,Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for (int i = 0; i < roman.length(); i++) {
            int c = map.get(roman.charAt(i));
            int n = 0;
            if(i<roman.length()-1) n = map.get(roman.charAt(i+1));

            if(n>c){
                sum += n-c;
                i++;
            }else{
                sum+=c;
            }
        }
        return sum;
    }
}
