package Learning.ArrayPractice;

import java.util.Arrays;

public class InsertElementInArray {
    public static void main(String[] args) {
        int[] arr = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
//        System.out.println(arr.length);
//        System.out.println(Arrays.toString(arr));
//        InsertByBrute(arr,0,14);
        InsertByShifting(arr,12,5);
//        System.out.println(Arrays.toString(arr));
    }


    static void InsertByShifting(int[] arr,int index, int val){

        if(arr.length == 0 && index == 0){
            System.out.println("Cannot Insert as provided array is empty");
            return;
        } else if (arr.length == 0) {
            System.out.println("Cannot Insert val at your provided index as Array length is 0");
            return;
        } else if (arr.length < index){
            System.out.println("Provided index value is out of bound");
            return;
        }

        for (int i = arr.length-1; i >= 0; i--) {
            if(i == index){
                arr[i] = val;
                return;
            }
            arr[i] = arr[i-1];
        }
    }

// Space complexity - O(n)
// Time complexity - O(n)
    static void InsertByBrute(int[] arr, int index, int val){
        if(arr.length == 0 && index == 0){
            int[] arrn = new int[arr.length+1];
            arrn[index] = val;
            System.out.println(Arrays.toString(arrn));
        } else if (arr.length == 0) {
            System.out.println("Cannot insert with array length 0 at you given index "+index);
        } else {
            int[] arrn = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                if(i < index){
                    arrn[i] = arr[i];
                }else if(i == index){
                    arrn[i] = val;
                }else{
                    arrn[i] = arr[i-1];
                }
            }
            System.out.println(Arrays.toString(arrn));
        }
    }
}
