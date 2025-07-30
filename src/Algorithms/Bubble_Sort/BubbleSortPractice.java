package Algorithms.Bubble_Sort;

import java.util.Arrays;

public class BubbleSortPractice {
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        Bubble(arr);
    }
    static void Bubble(int[] arr){
        for (int i = arr.length-1; i > 0 ; i--) {
            int swapped = 0;
            for (int j = 0; j < i; j++) {
                if(arr[j] > arr[j+1]){
                    swap(arr,j,j+1);
                    swapped = 1;
                }
            }
            if(swapped == 0){
                break;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr,int i,int min){
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
    }
}
