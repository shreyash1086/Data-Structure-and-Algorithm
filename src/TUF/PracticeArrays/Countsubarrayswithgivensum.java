package TUF.PracticeArrays;

import java.util.HashMap;

public class Countsubarrayswithgivensum {
    public static void main(String[] args) {
        int[] arr ={1,1,1};
        System.out.println(total(arr, 2));
    }
    static int total(int[] arr,int k){
        int prefixSum = 0;
        int count = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        for (int j = 0; j < arr.length; j++) {
            prefixSum = prefixSum + arr[j];
            if(hm.containsKey(prefixSum-k)){
                count = count+hm.get(prefixSum-k);
            }
            hm.put(prefixSum,hm.getOrDefault(prefixSum,0)+1);
        }
        return count;
    }
}
