package Algorithms.Insertion_Sort;

public class insertion_sort {
    public static void main(String[] args) {
        int[] arr={13,46,24,52,20,9};
        for (int i = 0; i<arr.length; i++){
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]){
                swap(arr,j-1,j);
                j--;
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
    static void swap(int[] arr,int a, int b){
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }
}
