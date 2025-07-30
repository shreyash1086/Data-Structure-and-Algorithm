package TUF.PracticeArrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class majorityElements {
    public static void main(String[] args) {

    }
    static ArrayList<Integer> arr(int[] arr){
        Map<Integer, Integer> hm = new HashMap<>();
        ArrayList<Integer> ls = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        for(int i: hm.keySet()){
            if(hm.get(i) > arr.length/3){
                ls.add(i);
            }
        }
        return ls;
    }
    static ArrayList<Integer> arrOptimal(int[] arr){
        int cnt1 = 0;
        int cnt2 = 0;
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(cnt1 == 0 && arr[i] != el2){
                cnt1 = 1;
                el1 = arr[i];
            }else if(cnt2 == 0 && arr[i] != el1){
                cnt2 = 1;
                el2 = arr[i];
            }else if(el1 == arr[i]){
                cnt1++;
            }else if(el2 == arr[i]){
                cnt2++;
            }else{
                cnt1--;
                cnt2--;
            }
        }
        ArrayList<Integer> ls = new ArrayList<>();
        cnt1 = 0;
        cnt2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if(el1 == arr[i]) cnt1++;
            if(el2 == arr[i]) cnt2++;
        }
        int min = (arr.length/3)+1;
        if(cnt1 >= min){
            ls.add(el1);
        }
        if(cnt2 >= min){
            ls.add(el2);
        }
        return ls;
    }
}
