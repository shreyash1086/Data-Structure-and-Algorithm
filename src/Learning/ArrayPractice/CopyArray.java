package Learning.ArrayPractice;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] arr = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        System.out.println("Old "+Arrays.toString(arr));
        int[] arrNew = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arrNew[i] = arr[i];
        }
        System.out.println("New "+Arrays.toString(arrNew));
    }

//    static void copy(int[] arr)
}
