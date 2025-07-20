package Algorithms.Linear_Search;

public class searchInRange {
    public static void main(String[] args) {
        int start = 1;
        int end = 4;
        int[] nums = {1,2,4,7,5,8,6,9,4,5,6,2,4,8,5,8,7,9,4,5,6,2,4};
        int target = 7;
        System.out.println(rangeSearch(nums,target,start,end));
    }
    static int rangeSearch(int[] arr,int target,int start,int end){
        for (int i = start; i <= end; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
