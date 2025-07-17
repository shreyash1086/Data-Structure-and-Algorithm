package TUF.PracticeArrays;

import java.util.Arrays;

public class RightRotateArraybyDplaces {
    public static void main(String[] args) {
        int[] arr = {-1,-100,3,99};
        System.out.println(Arrays.toString(arr));
        Optimal(arr,2);
    }

    static void Optimal(int[] nums,int k){

        if(nums.length <= 1){
            return;
        }

        reverse(nums,k+1, nums.length-1);
        reverse(nums,0,k);
        reverse(nums,0,nums.length-1);

        System.out.println(Arrays.toString(nums));
    }

    static void reverse(int[] arr,int start,int end){
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    //Time complexity - O(2n-k) ~ O(n)
    //Space complexity - O(n-k) ~ O(n)
    static void brute(int[] nums,int k){

        int n = nums.length;
        k = k%n;

        int[] temp = new int[n-k];
        for (int i = 0; i < n-k; i++) { // time - O(n-k)
            temp[i] = nums[i];
        }
//        System.out.println(Arrays.toString(temp));

        //shifting

        for (int i = n-k; i < nums.length; i++) {
            nums[i-(n-k)] = nums[i]; // time - O(n-(n-k)) = O(k)
        }

        // push back temp

        for (int i = k; i < nums.length; i++) {
            nums[i] = temp[i-k]; // time - O(n-k)
        }

        System.out.println(Arrays.toString(nums));

    }
}
