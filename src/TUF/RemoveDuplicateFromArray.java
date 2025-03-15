package TUF;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3};
        int unique = RemDup(arr);

//        int unique = Brute(arr);

        System.out.println(unique);

    }

//------------Optimal solution------------//

//    Complexity O(N)
// Space Complexity O(1)

    static int RemDup(int[] arr){
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }

//------------Optimal solution------------//

//------------Brute Force------------//

//    Complexity O(NlogN) + O(N)
//    Space Complexity O(N)

    static int Brute(int[] arr){
        Set<Integer> IntSet = new HashSet<>();
        for(int x : arr){
            IntSet.add(x);
        }
        return IntSet.size();
    }

//------------Brute Force------------//



}
