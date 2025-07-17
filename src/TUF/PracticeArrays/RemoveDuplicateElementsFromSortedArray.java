package TUF.PracticeArrays;

import java.util.*;

public class RemoveDuplicateElementsFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3};
        System.out.println(Optimal(arr));
    }

    // Time complexity is O(n) and space complexity is O(1)
    static int Optimal(int[] arr){
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if(arr[i] != arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));

        return i+1;
    }


    // Time complexity of O(nlogn) and space complexity is O(n);
    static int BruteForce(int[] arr){
        Set<Integer> st = new LinkedHashSet<>();

        for (int i = 0; i < arr.length; i++) { // time complexity of this loop is O(n) * O(logn)
            st.add(arr[i]); // set in order to insert take logn time
        }

        Iterator<Integer> it = st.iterator();

        int i = 0;
        while (it.hasNext()){//time complexity is O(n)
            arr[i] = it.next();
            i++;
        }
        return i;
    }
}
