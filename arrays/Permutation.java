import java.util.Arrays;
class Permutation {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3};
        generatePermutations(arr, 0);
    }
    static void generatePermutations(int[] arr, int index) {
        if (index == arr.length - 1) {
            System.out.println(Arrays.toString(arr));
        }
        for (int i = index; i < arr.length; i++) {
            swap(arr, index, i);
            generatePermutations(arr, index + 1);
        }
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}