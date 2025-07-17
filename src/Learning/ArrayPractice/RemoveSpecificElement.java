package Learning.ArrayPractice;

import java.util.Arrays;

public class RemoveSpecificElement {
    public static void main(String[] args) {
        int[] arr = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        System.out.println(Arrays.toString(arr));
        remove(arr,15);
        System.out.println(Arrays.toString(arr));
    }
    static void remove(int[] arr,int val){

        int index = -1;

        // First loop to find the index of the element
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == val){
                index = i;
                break; // to brake the loop at first occurrence of the element
            }
        }
        // If index of val not found - End Program
        if(index == -1){
            return;
        }

        // Second loop to shift elements left from the index of the "val" in the array
        if(arr[index] == val){
            for (int i = index; i < arr.length-1; i++) {
                arr[i] = arr[i+1];
            }
        }

    }
}
