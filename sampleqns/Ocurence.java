package sampleqns;
//  input: occurence
// output: o1c3u1r1e2n1
public class Ocurence {
    public static void main(String[] args) {
        occurences("occurence");
    }

    static void occurences(String str){
        int[] arr = new int[26];

        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);

            arr[ch-'a']++;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            int e = arr[ch-'a'];
            if(e!=0){
                System.out.print(ch+""+e);
                arr[ch-'a'] = 0;
            }
        }
    }
}
