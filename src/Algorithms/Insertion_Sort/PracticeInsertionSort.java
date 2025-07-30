package Algorithms.Insertion_Sort;

import java.util.Arrays;

import static Algorithms.Insertion_Sort.insertion_sort.swap;

public class PracticeInsertionSort {
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        insertion(arr);
    }
    static void insertion(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int j = i;
            while(j > 0 && arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
