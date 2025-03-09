package Binary_Search;

public class FandLOccurence {
    public static void main(String[] args) {

    }
    static  int[] searchRange(int[] nums,int target){

        int[] ans = {-1,-1};

// check for first occurrence of target first
        int start = search(nums,target,true);
        int end = search(nums,target,false);
        ans[0] = start; //if element is not found then the search function will return the value as -1 for both start and end;
        ans[1] = end;
        return ans;
    }

    //this function will just return the index value of target
    static int search(int[] nums, int target, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length -1;
        while(start <= end){
            //find middle
            int mid = start + (end - start) / 2;
            if(target > nums[mid]){
                start = mid + 1;
            }else if(target < nums[mid]){
                end = mid - 1;
            }else{
                //potential answer found
                ans = mid;
                if(findStartIndex == true){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
