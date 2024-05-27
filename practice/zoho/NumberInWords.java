package zoho;

public class NumberInWords {
    public static void main(String[] args) {
        
        System.out.println(words(705));
    }
    static String words(int n){
        String[] ones = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        String[] tens = {"","ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};

        String str = "";
        int num = 0;
        while (n>0) {
            int rem = n%10;
            switch (num) {
                case 0:
                    str = ones[rem];
                    break;
                case 1:
                    str = tens[rem]+" "+str;
                    break;
                case 2:
                    str = ones[rem]+" hundred and "+str;
                    break;
            }
            n /= 10;
            num++;
        }
        return str;
    }
}
