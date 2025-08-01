package Algorithms.Binary_Search;

public class FirstAndLastOccurenceOfElement {
    public static void main(String[] args) {

    }
    static int[] searchValue(int[] nums,int target){
        int[] ans = {-1,-1};
        return ans;
    }
    static int search(int[] nums,int target,boolean findstartindex){
        int ans = -1;
        int start = 0;
        int end = nums.length -1;
        while(start <= end){
            int mid = start + ( end - start)/2;
            if(target > nums[mid]){
                start = mid + 1;
            }else if(target < nums[mid]){
                end = mid - 1;
            }else {
                ans = mid;
                if(findstartindex){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
