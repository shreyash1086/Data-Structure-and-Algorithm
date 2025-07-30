package Algorithms.Merge_Sort;

import java.util.ArrayList;

public class PracticeMerge {
    public static void main(String[] args) {

    }
    static void mergeSort(int[] arr,int low,int high){
        if(low >= high) return;
        int mid = (low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }

    static void merge(int[] arr,int low,int mid,int high){
        int left = low;
        int right = mid+1;
        ArrayList<Integer> ls = new ArrayList<>();
        while(left <= mid && right <= high){
            if(arr[left] >= arr[right]){
                ls.add(arr[left]);
                left++;
            }else{
                ls.add(arr[right]);
                right++;
            }
        }

        while(left <= low){
            ls.add(left);
            left++;
        }

        while(right <= high){
            ls.add(right);
            right++;
        }

        for (int i = low; i <= high ; i++) {
            arr[i] = ls.get(i-low);
        }
    }
}
