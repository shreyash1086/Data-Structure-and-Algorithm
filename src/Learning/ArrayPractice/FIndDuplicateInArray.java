package Learning.ArrayPractice;

import java.util.ArrayList;

public class FIndDuplicateInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 5, 6, 6, 7, 2};
        duplicate(arr);
    }
    static void duplicate(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j] && i != j){
                    System.out.println("Duplicate element is "+arr[i]);
                }
            }
        }
    }
}
