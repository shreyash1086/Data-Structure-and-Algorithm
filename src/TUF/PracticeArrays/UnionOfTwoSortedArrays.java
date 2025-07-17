package TUF.PracticeArrays;

import java.util.*;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,3,4,4,5};
        UnionOptimal(arr1,arr2);
    }

    static void UnionOptimal(int[] arr1,int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        int i = 0;
        int j = 0;

        ArrayList<Integer> lt = new ArrayList<>();

        while(i < n && j < m){
            if(arr1[i] <= arr2[j]){
                if(lt.isEmpty() || lt.getLast() != arr1[i]){
                    lt.add(arr1[i]);
                }
                i++;
            }else {
                if(lt.isEmpty() || lt.getLast() != arr2[j]){
                    lt.add(arr2[j]);
                }
                j++;
            }
        }

        while(i < n){
            if(arr1[i] != lt.getLast()){
                lt.add(arr1[i]);
            }
            i++;
        }

        while (j < m){
            if(arr2[j] != lt.getLast()){
                lt.add(arr2[j]);
            }
            j++;
        }

        System.out.println(lt);
    }

    //Time complexity is O(n+m) and space O(m+n)
    static void Union(int[] arr1,int[] arr2){
        Set<Integer> st = new LinkedHashSet<>();

        for (int i = 0; i < arr1.length; i++) { //Time complexity is O(n)
            st.add(arr1[i]); // O(1)
        }
        for (int i = 0; i < arr2.length; i++) {//Time complexity is O(m)
            st.add(arr2[i]);// O(1)
        }

        int[] union = new int[st.size()];

        int i = 0;
        for(int it : st){
            union[i++] = it; //i is incremented after adding the element
        }

        System.out.println(Arrays.toString(union));
    }
}
