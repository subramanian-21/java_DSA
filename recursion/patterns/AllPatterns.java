package recursion.patterns;

import java.util.Arrays;

public class AllPatterns {
    public static void main(String[] args) {
        int[]a = {2,3,5,2,1,14,5,6};

        selectionSort(a, a.length-1, 0,0);
        System.out.println(Arrays.toString(a));
    }
    static void RightTrinagleDown(int r,int c){
        if(r == 0){
            return;
        }

        if(c<r){
            System.out.print("*");
            RightTrinagleDown(r, c+1);
        }else{
            System.out.print("\n");
            RightTrinagleDown(r-1, 0);
        }
    }
    static void RightTrinagleUp(int r,int c){
        if(r == 0){
            return;
        }

        if(c<r){
            
            RightTrinagleUp(r, c+1);
            System.out.print("*");
            
        }else{
            
            RightTrinagleUp(r-1, 0);
            System.out.println();
        }

    }

    static void bubbleSort(int[] arr,int r,int c){
        if(r == 0){
            return;
        }

        if(c<r){
            if(arr[c] > arr[c+1]){
                swap(arr,c,c+1);
            }
            bubbleSort(arr,r, c+1);
        }else{
            bubbleSort(arr,r-1, 0);   
        }
    }
    static void swap(int[] a,int s,int e){
        int temp = a[s];
        a[s] = a[e];
        a[e] = temp;
    }
    static void selectionSort(int[] arr,int r, int c , int max){
        if(r == 0){
            return;
        }

        if(c<r){
            if(arr[max] <= arr[c]){
                selectionSort(arr,r, c+1,c);
            }else{
                selectionSort(arr,r, c+1,max);
            }
        }else{
            swap(arr,r,max);
            selectionSort(arr,r-1, 0,0);   
        }
    }
}
