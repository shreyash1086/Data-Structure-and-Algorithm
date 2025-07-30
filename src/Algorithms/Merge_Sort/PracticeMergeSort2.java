package Algorithms.Merge_Sort;

import java.util.ArrayList;
import java.util.Arrays;

public class PracticeMergeSort2 {
    public static void main(String[] args) {
        int[] arr = {5,3,1,4,2};
        MergeSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void MergeSort(int[] arr,int low,int high){
        if(low >= high) return;
        int  mid = (low + high)/2;

        MergeSort(arr,low,mid);
        MergeSort(arr,mid+1,high);
        Merge(arr,low,mid,high);
    }

    static void Merge(int[] arr,int low,int mid,int high){
        ArrayList<Integer> ls = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while(left <= mid && right <= high){
            if(arr[left]>= arr[right]){
                ls.add(arr[right]);
                right++;
            }else{
                ls.add(arr[left]);
                left++;
            }
        }

        while(left <= mid){
            ls.add(arr[left]);
            left++;
        }

        while(right <= high){
            ls.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = ls.get(i-low);
        }
    }
}
