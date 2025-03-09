package Merge_Sort;

import Practice.Array;

import java.util.ArrayList;

public class Merge_sort {
    public static void main(String[] args) {
        int[] arr = {5,2,3,1,2};
        System.out.println("Before");
        for(int x:arr){
            System.out.println(x);
        }
        int low = 0;
        int high = arr.length - 1;
        mergeSort(arr,low,high);
        System.out.println("After");
        for (int x:arr){
            System.out.println(x);
        }
    }
    static void mergeSort(int[] arr, int low, int high){
        if(low >= high) return;
        int mid = (low + high )/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    static void merge(int[] arr,int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }else {
                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid){
            temp.add(arr[left]);
            left++;
        }

        while(right <= high){
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i<=high;i++){
            arr[i] = temp.get(i - low);
        }
    }
}
