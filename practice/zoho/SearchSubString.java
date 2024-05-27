package zoho;

import java.util.Arrays;

public class SearchSubString {

    public static void main(String[] args) {
        String txt = "WELCOMETOZOHOCORPORATION";
        SSS(txt, "CO");
    }

    static void SSS(String str, String search) {
        double d = Math.ceil(Math.sqrt(str.length()));

        char[][] mat = new char[(int) (d)][(int) (d)];
        int index = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (index < str.length()) {
                    mat[i][j] = str.charAt(index);
                    index++;
                } else {
                    break;
                }
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == search.charAt(0)) {

                    int k = j + 1;
                    int l = 1;
                    while (k < mat[0].length && l < search.length()) {
                        if (mat[i][k] == search.charAt(l)) {
                            l++;
                            k++;
                        } else {
                            break;
                        }
                    }
                    if (l == search.length()) {
                        System.out.println(search + " at index " + i + "," + j + " Horizontally ");
                    }

                    int x = i;
                    int y = 0;
                    while (x < mat.length && y < search.length()) {
                        if (mat[x][j] == search.charAt(y)) {
                            x++;
                            y++;
                            
                        } else {
                            break;
                        }
                    }
                    if (y == search.length()) {
                        System.out.println(search + " at index " + i + "," + j + " Vertically ");
                    }
                }
            }
        }
    }
}
