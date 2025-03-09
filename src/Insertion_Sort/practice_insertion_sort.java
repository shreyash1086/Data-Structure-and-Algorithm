package Insertion_Sort;

public class practice_insertion_sort {
    public static void main(String[] args) {
        int[] arr = {12, 5, 8, 19, 3, 7, 2, 15, 6, 10};
        for (int i = 0; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]){
                // the j>0 won't let the first element to get involved with the j - 1 th element cause if j = 0 there is no j - 1 element in an array
                // the arr[j - 1] > arr[j] signifies that if left element of the current target element is grater then it will swap & swapping will continue till the target element will get placed at its index position
                swap(arr,j-1,j);
                j--;
            }
        }
        for (int x : arr){
            System.out.println(x);
        }
    }
    static void swap(int[] arr,int a, int b){
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }
}
