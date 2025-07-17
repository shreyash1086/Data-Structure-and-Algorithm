package Learning.ArrayPractice;

import java.util.ArrayList;

public class ArrayToArrayList {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 5, 6, 6, 7, 2};
        ArrayList<Integer> arrn = new ArrayList<>();
        System.out.println(arrn);
        for (int i = 0; i < arr.length; i++) {
            arrn.add(arr[i]);
        }
        System.out.println(arrn);
    }
}
