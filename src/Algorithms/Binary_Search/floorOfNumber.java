package Algorithms.Binary_Search;

public class floorOfNumber {
    public static void main(String[] args) {

    }
    static int floor(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return arr[mid];
            }
            if(target > arr[mid]){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return arr[end];
    }
}
