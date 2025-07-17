package TUF.PracticeArrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveAllZeroToEnd {
    public static void main(String[] args) {
        int[]  nums = {0,0,1};
        similarTOswap2(nums);
    }

//time complexity is O(n) and space complexity is O(n)
    static void Move(int[] nums) {
        ArrayList<Integer> lt = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) { //O(n)
            if(nums[i] != 0){
                lt.add(nums[i]);
            }
        }

        for (int i = 0; i < lt.size(); i++) { //O(n)
            nums[i] = lt.get(i);
        }

        for (int i = lt.size(); i < nums.length; i++) { //O(n-k)
            nums[i] = 0;
        }

        System.out.println(Arrays.toString(nums));

    }

// time complexity is O(n) and space complexity is O(1) - solved using two pointer method
    static void Move2(int[] nums){
        int i = 0;
        int j = 0;

        while(j < nums.length){
            if(nums[i] == 0 && nums[j] != 0){
                swap(nums,i,j);
                i++;
                j++;
            }else if (nums[i] == 0 && nums[j] == 0) {
                j++;
            }else{
                i++;
                j++;
            }
        }

        System.out.println(Arrays.toString(nums));
    }

    static void swap(int[] arr,int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void similarTOswap2(int[] nums){
        int j = -1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                j = i;
                break;
            }
        }
        if (j == -1) return;
        //J stays as it is, and only I move no matter what
        //if 'i' is non-zero I replace the Jth element using swap
        for (int i = j+1; i < nums.length; i++) {
            if(nums[i] != 0){
                swap(nums,i,j);
                j++;
            }
        }

        System.out.println(Arrays.toString(nums));
        
    }
}
