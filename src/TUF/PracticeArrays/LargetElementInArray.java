package TUF.PracticeArrays;

import java.util.Arrays;

public class LargetElementInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 5, 0, 6, 7, 2};
        System.out.println(Optimal(arr));
//        Arrays.sort(arr); // This method sorts the array in nlogn time and logn space requirenments.
        //This method under the hood implements the quickSort technique to sort an array
        System.out.println(Brute(arr));
    }

    //Time complexity = O(n)
    static int Optimal(int[] arr){
        int large = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (large < arr[i]){
                large = arr[i];
            }
        }
        return large;
    }

    // time complexity nlogn and space complexity is logn
    static int Brute(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}
