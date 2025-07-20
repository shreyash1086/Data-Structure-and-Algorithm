package TUF.PracticeArrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3,2,4};
        System.out.println(Arrays.toString(twoSum(arr,6)));
    }


//    /time complexity is O(n) and space complexity is O(1) this solution can help return true and false optimally
    static boolean optimal(int[] arr,int target){
        int i=0;
        int j=arr.length-1;
        Arrays.sort(arr);
        while(i<j){
            if(arr[i]+arr[j] == target){
                return true;
            }else{
                if(arr[i]+arr[j] < target){
                    i++;
                }else{
                    j--;
                }
            }
        }
        return false;
    }

    //time complexity is O(n) and space complexity is O(n)
    static int[] twosum2(int[] arr,int target){
        Map<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int temp = target - arr[i];
            if(hm.containsKey(temp)){ //O(1)
                return new int[]{hm.get(temp),i};//O(1)
            }else{
                hm.put(arr[i],i);//O(1)
            }
        }
        return new int[]{0,0};
    }
    static int[] twoSum(int[] arr,int target){
        int i = 0;
        int j = i+1;

        while(i<arr.length-1){
            if(arr[i]+arr[j] == target){
                return new int[]{i,j};
            }else{
                if(arr[i]+arr[j] > target){
                    j++;
                }else{
                    i++;
                }
            }

        }
        return new int[]{0,0};
    }
}
