package TUF.PracticeArrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LeadersinanArray {
    public static void main(String[] args) {
        int[] arr = {4, 7, 1, 0};
        optimal(arr);
    }

    //time complexity is O(n)+O(m) and space complexity is O(m)
    static void optimal(int[] arr){
        int lead = Integer.MIN_VALUE;
        ArrayList<Integer> ls = new ArrayList<>();
        for (int i = arr.length-1; i >= 0; i--) {
            if(lead < arr[i]){
                lead = arr[i];
                ls.add(lead);
            }
        }
        Collections.reverse(ls); //O(n)
        System.out.println(ls);
    }

    //time complexity is O(n^2) and space complexity is O(m)
    static void leaders(int[] arr){
        int i = 0;
        ArrayList<Integer> ls = new ArrayList<>();
        while (i<arr.length) {
            int leadind = i;
            int lead = arr[i];
            for (int j = i+1; j < arr.length; j++) {
//                lead = Math.max(lead,arr[j]);
                if(lead < arr[j]){
                    lead = arr[j];
                    leadind = j;
                }
            }
            ls.add(lead);
            i=leadind+1;
        }
        System.out.println(ls);
    }
}
