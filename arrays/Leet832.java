import java.util.Arrays;

/**
 * Given an n x n binary matrix image, flip the image horizontally, then invert
 * it, and return the resulting image.
 * 
 * To flip an image horizontally means that each row of the image is reversed.
 * 
 * For example, flipping [1,1,0] horizontally results in [0,1,1].
 * To invert an image means that each 0 is replaced by 1, and each 1 is replaced
 * by 0.
 * 
 * For example, inverting [0,1,1] results in [1,0,0].
 * 
 */
public class Leet832 {
    public static void main(String[] args) {
        int[][] arr = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };

        int[][] out = flipAndInvertImage(arr);
        for (int i = 0; i < out.length; i++) {
            System.out.println(Arrays.toString(out[i]));
        }
    }

    static int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            int start = 0, end = image[0].length-1;
            while (start < end) {
                int temp = image[i][start];
                image[i][start] = image[i][end];
                image[i][end] = temp;
                start++;
                end--;
            }
            for (int j = 0; j < image[i].length; j++) {
                if(image[i][j] == 0){
                    image[i][j] = 1;
                }else{
                   image[i][j] = 0;
                }
            }
        }
        return image;
    }
}
