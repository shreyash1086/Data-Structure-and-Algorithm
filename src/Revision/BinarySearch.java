package Revision;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,4,12,22,345,5678,7945};
        int target = 7945;
        int result = binarySearch(arr,target);
        System.out.println(result);
    }
    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<= end){ // if the start and end crosses each other that means the element is not present in the array
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(target > arr[mid]){
                start = mid + 1;
            }else if(target < arr[mid]){
                end = mid - 1;
            }
        }
        return 0;
    }
}
