package Algorithms.Binary_Search;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {12,21,23,45,55,78,89,434,534,543};
        int target = 434;
        System.out.println(AgnosticBS(arr,target));
    }
    static int AgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAscending = arr[start] < arr[end];
        while (start <= end){
            int mid = start + (end - start)/2;
//            System.out.println(arr[mid]);
            if(target == arr[mid]){
                return mid;
            }
            if(isAscending){
                if(target > arr[mid]){
                    start = mid + 1;
                }else {
                    end = mid - 1;
                }
            }else {
                if(target < arr[mid]){
                    start = mid + 1;
                }else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
