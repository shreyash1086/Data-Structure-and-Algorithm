package TUF.PracticeArrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Findthenumberthatappearsonceandothernumberstwice {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4};
        System.out.println(Better2(arr));
    }

    //Using the HashMap Class
    //time complexity - O(NlogM)+O(M) where N is the size of the array and M is the size of the Map M = (N/2)+1 as every element appears twice except one.
    //Space complexity -
    static int Better2(int[] arr){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) { //space complexity is O(NlogM)
            int value = hm.getOrDefault(arr[i],0); //set value variable to the value of key arr[i] and if not present then 0;
            hm.put(arr[i],value+1);
        }

        for (Map.Entry<Integer, Integer> it: hm.entrySet()) { // time complexity is O(M)
            if(it.getValue() == 1){
                return it.getKey();
            }
        }

        return -1;
    }


    //Better solution - using hashing
    //space complexity is O(max) 
    static int Better(int[] arr){
        int largest = arr[1];

        for (int i = 0; i < arr.length; i++) { //time complexity - O(n)
            if(arr[i]>largest){
                largest = arr[i];
            }
        }

        int[] HashArray = new int[largest+1];

        for (int i = 0; i < arr.length; i++) { //time complexity - O(n)
            HashArray[arr[i]]++;
        }

        for (int i = 0; i < arr.length; i++) { //time complexity - O(n)
            if(HashArray[arr[i]] == 1){
                return arr[i];
            }
        }
        return -1;
    }


    //Time O(n square) and space complexity is O(1)
    static int bruteForce(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] == num){
                    count++; //The number that appear only once will have its count as 1 else 2;
                }
            }
            if(count == 1){
                return num;
            }
        }
        return -1;
    }


    //Finds the solution but the facts are
    //Time complexity - O(nlogn) + O(n^2)
    //space complexity is O(logn)
    //This one is better than the bruteForce2
    static int findByBrute(int[] nums){
        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            int flag = 0;
            for (int j = i+1; j < nums.length; j++) {
                if(i != j && nums[i] == nums[j]){
                    i++;
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                return nums[i];
            }
        }
        return -1;
    }

    // time complexity is O(n^2) worst of all
    static int findByBrute2(int[] nums){
//        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            int flag = 0;
            for (int j = 0; j < nums.length; j++) {
                if(i != j && nums[i] == nums[j]){
//                    i++;
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                return nums[i];
            }
        }
        return -1;
    }

//     // does not give the exact solution
//    //time complexity is O(n) and space complexity is O(1)
//    static int find(int[] arr){
//
//        if(arr.length % 2 == 0){
//            return 0;
//        }
//
//        int n = (arr.length+1)/2;
//
//        int sum = (n * (n+1))/2;
//        sum = sum + sum;
//
//        int res = 0;
//        for (int i = 0; i < arr.length; i++) {
//            res = res + arr[i];
//        }
//
//        return sum - res;
//    }
//
//    //
//    static int solution(int[] arr){
//        if(arr.length % 2 == 0){
//            return 0;
//        }
//        int i = 0;
//        int j = i+1;
//        while(j < arr.length){
//            if((arr[i] ^ arr[j]) != 0){
//                return arr[i];
//            } else if (j+1 == arr.length-1) {
//                return arr[j+1];
//            } else{
//                i = j+1;
//                j = i+1;
//            }
//        }
//        return 0;
//    }
}
