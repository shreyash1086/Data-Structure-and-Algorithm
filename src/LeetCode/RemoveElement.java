package LeetCode;

import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {3,2,2,3};
        int val = 3;
        removeElements(arr,val);
    }
    static int removeElements(int[] nums,int val){
            int len = nums.length;
            int j = 0;
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] == val){
                    nums[i] = 0;
                    len--;
                }
            }
            return len; 
    }
}
