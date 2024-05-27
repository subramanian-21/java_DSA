package zoho;

import java.util.ArrayList;
import java.util.Arrays;

public class FindFriends {
    public static void main(String[] args) {
        String[] arr ={ "Mani 3 ram raj guna","Ram 2 kumar Kishore","Mughil 3 praveen Naveen Ramesh"};
        findFriends(arr);
    }
    static void findFriends(String[] arr){
        
        ArrayList<String> alreadyFriends = new ArrayList<>();
        ArrayList<String> newFriends = new ArrayList<>();
    
        for(int i = 0;i<arr.length;i++){
            int k = arr[i].indexOf(" ");
            alreadyFriends.add(arr[i].substring(0,k));
        }
        for(int i = 0;i<arr.length;i++){
            int k = arr[i].indexOf(" ");
            String[] f = arr[i].substring(k+3).split(" ");
            for (int j = 0; j < f.length; j++) {
                if(!isFriend(f[j], alreadyFriends)){
                    newFriends.add(f[j]);
                }
            }
            
        }
        System.out.println(newFriends);
    }
    static boolean isFriend(String str,ArrayList<String> friends){
        for(String i: friends){
            if(i.toLowerCase().equals(str.toLowerCase())){
                return true;
            }
        }
        return false;
    }
}
