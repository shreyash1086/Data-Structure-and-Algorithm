package Learning.ArrayPractice;

import java.util.Arrays;

public class Max_Min_in_Array {
    public static void main(String[] args) {
        int[] arr = {1,12,15,17,19,45,16,25,48};
        int[] array = Max_Min(arr);
        System.out.println(Arrays.toString(array));
    }
    static int[] Max_Min(int[] arr){

        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }
        int[] arr2 = {min,max};
        return arr2;
    }
}
