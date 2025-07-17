package Learning.ArrayPractice;

import java.util.Arrays;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 5, 0, 6, 7, 2};
        MoveZeroToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void MoveZeroToEnd(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                for (int j = i; j < arr.length-1; j++) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
