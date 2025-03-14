package Bubble_Sort;

public class Practice_BubbleSort {
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9,45,56};
        for(int i = arr.length - 1; i >=1;i--){
            int didswap = 0;
            for (int j = 0; j <= i-1;j++){
                if(arr[j] > arr[j+1]){
                    swap(arr,j,j+1);
                    didswap = 1;
                }
            }
            if(didswap == 0){
                break;
            }
        }
        for (int x : arr){
            System.out.println(x);
        }
    }
    static void swap(int[] arr,int a,int b){
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }
}
