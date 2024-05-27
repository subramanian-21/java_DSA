package zoho;

public class ValidExpression {
    public static void main(String[] args) {
        System.out.println(isValid("(a-b)*(ab))"));
    }

    static boolean isValid(String str) {
        int n = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (isOperator(ch)) {
                if (!(i > 0 && i < str.length() - 2 && !isOperator(str.charAt(i - 1))
                        && !isOperator(str.charAt(i + 1)))) {
                    return false;
                }
            }
            if(ch == '('){
                n++;
            }else if(ch == ')'){
                n--;
            }
        }
        return n==0;
    }

    static boolean isOperator(char op) {
        if (op == '+' || op == '-' || op == '*' || op == '/') {
            return true;
        }
        return false;
    }

}
