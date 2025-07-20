package TUF.PracticeArrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {

    }
    static int major(int[] arr){
        int n = arr.length/2;
        Map<Integer,Integer> mp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        for(int x: mp.keySet()){
            if(mp.get(x)>n){
                return x;
            }
        }
        return 0;
    }
}
