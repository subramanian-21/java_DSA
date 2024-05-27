package zoho;

import java.util.ArrayList;

public class LargestPrime {
    public static void main(String[] args) {
        largestPrime(4691);
    }
    static void largestPrime(int n){
        ArrayList<String> perms = new ArrayList<>();
        int num = n;
        int length = (int)(Math.log10(n));
        char[] ch = new char[length+1];

        while (num > 0) {
            int rem = num%10;
            ch[length] = (char)(rem+48);
            num = num /10;
            length--;
        }
        generatePerms(ch, 0, perms);
        System.out.println(perms);
        long max = 0;
        for(String i : perms){
            if(isPrime(i)){
                int number = Integer.parseInt(i);
                max = Math.max(max, number);
            }
        }
        System.out.println(perms);
        System.out.println(max);
    }
    static void generatePerms(char[] ch,int index,ArrayList<String> arr){
        if(index == ch.length){
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < ch.length; i++) {
                sb.append(ch[i]);
            }
            arr.add(sb.toString());
            return;
        }
        for (int i = index; i < ch.length; i++) {
            swap(ch, index, i);
            generatePerms(ch, index+1, arr);
            swap(ch, index, i);
        }
    }
    static boolean isPrime(String s){
        int num = Integer.parseInt(s);
        for (int i = 2; i <= num/2; i++) {
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
    static void swap(char[] arr,int i,int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
