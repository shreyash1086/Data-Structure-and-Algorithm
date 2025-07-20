package Algorithms.Binary_Search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,4,12,22,345,5678,7945};
        int target = 5678;
        System.out.println(Binarysearch(arr,target));
    }
    //return the index if found
    //return -1 if not found
    static int Binarysearch(int[] arr,int target){
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            //find middle
            int mid = start + (end - start) / 2;
            if(target > arr[mid]){
                start = mid + 1;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
