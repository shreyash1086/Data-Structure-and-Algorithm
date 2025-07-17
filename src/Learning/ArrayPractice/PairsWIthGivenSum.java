package Learning.ArrayPractice;

import java.util.ArrayList;

public class PairsWIthGivenSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 5, 6, 6, 7, 2};
        int sum = 8;
        pair(arr,sum);
    }

    static void pair(int[] arr,int sum){
        ArrayList<ArrayList<Integer>> arrn = new ArrayList<>();

        for (int i = 0; i < (arr.length/2)+1; i++) {
            arrn.add(i,new ArrayList<>());
        }
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if(arr[i]+arr[j] == sum){
                    arrn.get(temp).add(arr[i]);
                    arrn.get(temp).add(arr[j]);
                    temp++;
                }
            }
        }
        System.out.println(arrn);
    }
}
