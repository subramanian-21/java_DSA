package recursion.recursion2;

public class Skip {
    public static void main(String[] args) {
        skipA("aaaaaaaaaaaaaaaaapple", "");


        System.out.println(skipRet("the best fuckn thing i like in the fuckn english language is that we can use the word fuckn in any fuckn way we want"));
    }

    static void skipA(String str,String p){
        if(str.isEmpty()){
            System.out.println(p);
            return;
        }

        char q = str.charAt(0);

        if(q == 'a'){
            skipA(str.substring(1), p);
        }else{
            skipA(str.substring(1), p+q);
        }
    }
    static String skipRet(String str){
        if(str.isEmpty()){
            return "";
        }

        if(str.startsWith("fuck")){
          return "duck"+ skipRet(str.substring(4));
        }else{
            return str.charAt(0) + skipRet(str.substring(1));
        }
    }


}
