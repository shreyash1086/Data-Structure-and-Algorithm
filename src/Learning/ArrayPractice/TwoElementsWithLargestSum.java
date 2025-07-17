package Learning.ArrayPractice;

import java.util.Arrays;

public class TwoElementsWithLargestSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 5, 15, 6, 7, 2};
        int target = 10;
        System.out.println(Arrays.toString(sum(arr,target)));
    }

    static int[] sum(int[] arr,int target){

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                if(sum == target){
                    return new int[]{arr[i],arr[j]};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
