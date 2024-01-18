package bitwise;

public class UniqueElement {
    public static void main(String[] args) {
        System.out.println(uniqueElement(new int[] {2,3,2,4,3,4,6,5,5}));
    }
    
    static int uniqueElement(int[] arr){
        int unique = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(unique +"^" +""+arr[i] +" = "+(unique ^ arr[i] ));
            unique = unique ^ arr[i];
            
        }
        return unique;
    }
}
