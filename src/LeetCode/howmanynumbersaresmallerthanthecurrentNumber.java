package LeetCode;

import java.util.Arrays;

public class howmanynumbersaresmallerthanthecurrentNumber {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int[] res = smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(res));
    }
    static int[] smallerNumbersThanCurrent(int[] nums){
        int[] arr = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            int count = 0;
            for(int j = 0; j <nums.length ;j++){
                if(nums[i] > nums[j]){
                    count++;
                }
            }
            arr[i] = count;
        }
        return arr;
    }
}
