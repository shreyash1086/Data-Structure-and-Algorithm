package Learning.ArrayPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchValue {
    public static void main(String[] args) {
        int[] arr = {1,12,45,45,89};
        System.out.println(search(arr,45));
        System.out.println(searchIndex(arr,45));

    }
    static boolean search(int[] arr,int target){
        if(arr.length == 0){
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }

    static int searchIndex(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
