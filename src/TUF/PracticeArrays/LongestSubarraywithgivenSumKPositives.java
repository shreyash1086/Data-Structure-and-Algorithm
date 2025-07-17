package TUF.PracticeArrays;

import java.util.HashMap;

public class LongestSubarraywithgivenSumKPositives {
    public static void main(String[] args) {
        int[] arr= {1,2,3,1,1,1,1,3,3};
        int k = 6;
        System.out.println(resultOpt(arr,k));
    }

    static int resultOpt(int[] arr,int k){
        int left = 0;
        int right= 0;
        int sum = arr[0];
        int len = 0;

        while(right<arr.length) {
            //if sum>k reduce the sub array from the left
            //until sum become lesser or equal to k
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }

            if (sum == k) {
                len = Math.max(len, right - left + 1);
            }

            right++;
            if (right < arr.length) sum += arr[right];
        }
        return len;
    }

    //time complexity is O(n) and space complexity is O(n)
    //This solution only works for the integer in array ranging from 1 to n ; it won't work if array has zeros.
    //Now this solution can work for zeros as well as for the negative numbers
    static long better(int[] arr,int k){
        long prefixSum = 0;
        long len = 0;
        HashMap<Long,Long> mp = new HashMap<>();
        for (long i = 0; i < arr.length; i++) {
            prefixSum += arr[(int) i];
            if(prefixSum == k){
                len = Math.max(len,i + 1);
            }
            long rem = prefixSum-k;
            if(mp.containsKey(rem) && len < i - mp.get(rem)){
                len = i - mp.get(rem);
            }
            if(!mp.containsKey(prefixSum)){
                mp.put(prefixSum, i);
            }
        }
        return len;
    }

    //Time complexity is O(n^2)
    //space complexity is O(1)
    static int approach1(int[] arr,int k){
        int length = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = i; j < arr.length; j++) {
                temp = temp + arr[j];
                if(temp == k && length < j-i+1){
                    length = j - i + 1;
                    break;
                }
            }
        }
        return length;
    }
}
