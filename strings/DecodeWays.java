public class DecodeWays {
    public static void main(String[] args) {
        
    }

    static int count(String str,int s,int e){
        if(e == str.length()){
            return 1;
        }
        int number = Integer.parseInt(str.substring(s,e));
        if(number > 26){
            return 0;
        }

        int count = 0;
        count += count(str, s+1, e+1);
        count+= count(str,s+1,e+2);
        return  count;

    }
}
