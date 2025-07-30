package TUF.PracticeArrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequenceInArray {
    public static void main(String[] args) {
        int[] arr = {100,4,200,1,3,2};
        System.out.println(better(arr));
    }
    //optimal
    static int opt(int[] arr){
        if(arr.length == 0) return 0;
        int longest = 1;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        for(int it: set){
            if(!set.contains(it-1)){
                int cnt = 1;
                int x = it;
                while(set.contains(x+1)){
                    x=x+1;
                    cnt=cnt+1;
                }
                longest=Math.max(longest,cnt);
            }
        }
        return longest;
    }

    //better
    static int better(int[] arr){
        Arrays.sort(arr);
        int longest = 1;
        int cnt = 0;
        int lastsmall = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]-1 == lastsmall){
                cnt = cnt + 1;
                lastsmall = arr[i];
            }else if(arr[i] != lastsmall){
                cnt = 1;
                lastsmall = arr[i];
            }
            longest = Math.max(longest,cnt);
        }
        return longest;
    }

//    brute
    //time complexity is O(n^2) and space complexity is O(1)
    static int brute(int[] arr){
        int longest = 1;
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            int cnt = 1;
            while(ls(arr,x+1)){
                x=x+1;
                cnt=cnt+1;
            }
            longest = Math.max(longest,cnt);
        }
        return longest;
    }
    static boolean ls(int[] arr,int x){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x){
                return true;
            }
        }
        return false;
    }

    //time O(n) + O(nlogn)
    //space O(logn)
    static int LongestMy(int[] arr){
        if(arr.length == 0){
            return 0;
        }
        int sequence = 1;
        int temp = 1;
        int i = 0;
        int j = i+1;
        Arrays.sort(arr);
        while(j<arr.length){
            if(arr[i]+1 == arr[j]){
                temp++;
            }else if(arr[i] != arr[j]){
                temp = 1;
            }
            sequence=Math.max(sequence,temp);
            i++;
            j++;
        }
        return sequence;
    }
}
