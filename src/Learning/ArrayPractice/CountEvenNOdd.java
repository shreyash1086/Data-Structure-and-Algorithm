package Learning.ArrayPractice;

import java.util.Arrays;

public class CountEvenNOdd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 5, 6, 6, 7, 2};
        System.out.println(Arrays.toString(EvenOdd(arr)));
    }
    static int[] EvenOdd(int[] arr){
        int even = 0;
        int odd = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2 == 0){
                even++;
            }else {
                odd++;
            }
        }

        return new int[]{even,odd};
    }
}
