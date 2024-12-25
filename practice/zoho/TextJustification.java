package zoho;
import java.util.*;
public class TextJustification {
    public static void main(String[] args) {
        String str = "hi my name is subramanian iam doing my computer science engineering.";
        String[] arr = str.split(" ");
        System.out.println(justifyText(arr, 200));
    }
    static List<String> justifyText(String[] arr, int maxWidth){
        List<String> li = new ArrayList<>();

        int ind = 0;
        while (ind < arr.length) {
            int count =  arr[ind].length();
            int last = ind+1;

            while(last < arr.length){
                if((count+1+ arr[last].length()) > maxWidth) break;

                count += 1+arr[last].length();
                last++;
            }

            String out = arr[ind];
            int diff = last -ind -1;

            if(last == arr.length || diff == 0){
                for(int i = ind+1;i<last;i++){
                    out += " ";
                    out += arr[i];
                }
                for(int i = out.length() ;i< maxWidth;i++){
                    out+= " ";
                }
            }else{
                int space = (maxWidth-count)/diff ;
                int extra = (maxWidth - count) % diff;

                for(int i = ind +1;i<last;i++){
                    for (int j = 0; j < space; j++) {
                        out+=" ";
                    }
                    if(extra > 0){
                        out += " ";
                        extra--;
                    }
                    out += " ";
                    out+=arr[i];

                }
            }
            li.add(out);
            ind = last;
        }

        return li;
    }
}
