package Learning.Basic;

import java.util.Arrays;

public class ProblemSet2 {
    public static void main(String[] args) {
        int[] arr = {14, 23, 27, 78, 36, 45, 49};
//        System.out.println(Arrays.toString(arr));
//        swap(arr,2,5);
//        System.out.println(Arrays.toString(arr));

//        int large = max(arr);
//        System.out.println(large);
//
//        int largeInRange = MaxInRange(arr,1,4);
//        System.out.println(largeInRange);

        reverse(arr);

        System.out.println(Arrays.toString(arr));

    }

    static void swap(int[] arr, int indexA , int indexB){
        int temp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = temp;
    }

    static int max(int[] arr){

        if(arr.length == 0){
            return -1;
        }

        int large = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > large){
                large = arr[i];
            }
        }
        return large;
    }

    static int MaxInRange(int[] arr, int from , int to){

        if(from > to){
            return -1;
        }

        if(arr == null){
            return -1;
        }

        int large = arr[from];
        for(int i = from; i <= to; i++){
            if(arr[i] > large){
                large = arr[i];
            }
        }
        return large;
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}
