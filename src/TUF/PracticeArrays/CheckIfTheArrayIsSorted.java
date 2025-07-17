package TUF.PracticeArrays;

import java.util.Arrays;

public class CheckIfTheArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = {12, 23, 21, 54, 23, 45};
//        System.out.println(BruteForce(arr));
        System.out.println(Optimal(arr));
    }

    // time complexity is O(n) and space complexity is o(n)
    static boolean Optimal(int[] arr){

        if(arr.length == 0 || arr.length == 1){
            return true;
        }
        int i = 0;
        int j = 1;
        while (j < arr.length){
            if(arr[i]<=arr[j]){
                i = j;
                j++;
            }else {
                return false;
            }
        }
        return true;
    }

    //time complexity is nlogn and space complexity is n
    static boolean BruteForce(int[] arr){
        int[] arrn = new int[arr.length];

        for (int i = 0; i < arr.length; i++) { // n space complexity
            arrn[i] = arr[i];
        }

        System.out.println(Arrays.toString(arrn));

        Arrays.sort(arrn); // sorts the array in nlogn time and logn space complexity

        System.out.println(Arrays.toString(arrn));

        for (int i = 0; i < arr.length; i++) {
            if(arrn[i] != arr[i]){
                return false;
            }
        }
        return true;
    }
}
