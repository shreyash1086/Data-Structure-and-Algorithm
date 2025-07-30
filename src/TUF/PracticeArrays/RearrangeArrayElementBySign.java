package TUF.PracticeArrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeArrayElementBySign {
    public static void main(String[] args) {
        int[] arr = {28,-41,22,-8,-37,46,35,-9,18,-6,19,-26,-37,-10,-9,15,14,31};
        System.out.println(Arrays.toString(rearrange2(arr)));
    }

    //time O(n) and space O(n)
    static int[] rearrange3(int[] arr){
        int[] ans = new int[arr.length];
        int p = 0;
        int n = 1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0){
                ans[p] = arr[i];
                p=p+2;
            }
            if(arr[i]<0){
                ans[n] = arr[i];
                n=n+2;
            }
        }
        return ans;
    }

    //This is an acceptable solution

    //time - O(n+n) && time O(n)
    static int[] rearrange2(int[] arr){
        ArrayList<Integer> arrP = new ArrayList<>();//space O(n/2)
        ArrayList<Integer> arrN = new ArrayList<>();//space O(n/2)

        for(int i=0;i<arr.length;i++){//O(n)
            if(arr[i] > 0){
                arrP.add(arr[i]);
            }

            if(arr[i] < 0){
                arrN.add(arr[i]);
            }
        }
        int m = 0;
        int n = 0;

        for (int i = 0; i < arr.length; i++) { //O(n)
            if(i%2 == 0){
                arr[i] = arrP.get(m);
                m++;
            }
            if(i%2 == 1){
                arr[i] = arrN.get(n);
                n++;
            }
        }

        return arr;
    }

}
