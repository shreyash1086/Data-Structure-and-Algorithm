package Learning.ArrayPractice;

import java.util.Arrays;

public class RemoveElementByIndex {
    public static void main(String[] args) {
        int[] arr = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        System.out.println(Arrays.toString(arr));
//        remove(arr,arr.length-1);
//        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(removeNreduceLength(arr,36)));

    }

    static void remove(int[] arr, int index){

        if(index == arr.length-1){
            arr[index] = arr[index-1];
            return;
        }

        for (int i = index; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
    }

    // reduce the length of the element

    static int[] removeNreduceLength(int[] arr, int val){

        int[] arrn = new int[arr.length-1];
        int i = 0;

        for (int j = 0; j < arr.length-1; j++) {
            if (arr[i] == val){
                i++;
            }
            arrn[j] = arr[i];
            i++;
        }

        return arrn;
    }
}
