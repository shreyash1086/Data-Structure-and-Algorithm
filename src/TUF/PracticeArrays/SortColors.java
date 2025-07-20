package TUF.PracticeArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortColors {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sortInplace(arr);
    }

    //but we have to sort it in place

    //time complexity is O(n)+O(1) and space complexity is O(1)
    static void sortInplace(int[] arr){
        int i = 0;
        int j = arr.length-1;
        while(i<j){ //O(n)
            if(arr[i] != 0){
                if(arr[j] == 0){
                    swap(arr,i,j);
                    i++;
                    j--;
                }else{
                    j--;
                }
            }else{
                i++;
            }
        }

        int k = arr.length-1;

        while (i<k){ //O(m)
            if(arr[i] != 1){
                if(arr[k] == 1){
                    swap(arr,i,k);
                    i++;
                    k--;
                }else {
                    k--;
                }
            }else{
                i++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //time complexity is O(n)+O(n) and space complexity is O(3)+O(n)
    static void sort(int[] arr){
        Map<Integer,Integer> hm = new HashMap<>();//O(3)
        for (int i = 0; i < arr.length; i++) { //O(n)
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        ArrayList<Integer> li = new ArrayList<>();//O(n)

        for (int i = 0; i <= 2; i++) { //O(2)
            for (int j = 0; j < hm.get(i); j++) { //O(n)
                li.add(i);
            }
        }
    }
}
