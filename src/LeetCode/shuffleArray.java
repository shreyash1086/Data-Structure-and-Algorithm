package LeetCode;

import java.util.Arrays;

public class shuffleArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2};
        int n = 2;
        shuffle(nums,n);
    }
    static int[] shuffle(int[] nums,int n){
        int index = index(nums,n);
        System.out.println("Index found "+index);
        int[] ans = new int[nums.length];
        for(int j = 0; j<nums.length && index < nums.length; j++){
            ans[j] = nums[index];
            index++;
        }
        System.out.println("new array "+Arrays.toString(ans));
        return nums;
    }

    static int index(int[] nums,int n){
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == n){
                return i;
            }
        }
        return 0;
    }
}
