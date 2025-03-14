package TUF;

public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9,45,56};
        int[] arr1 = {1, 2, 3, 4, 5};
//        System.out.println(MyApproch(arr1));
        System.out.println(brute(arr));
    }

//------------Optimal Force------------//
    // time Complexity is O(N)
    static boolean brute(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }

//------------Optimal Force------------//

//------------blind Approach------------//
    // time Complexity = O(n^2)
    static boolean MyApproch(int[] arr){
        int didswap = 0;
        for (int i = arr.length-1; i >= 1; i--){
            for (int j = 0; j <= i - 1; j++) {
                if(arr[j] > arr[j+1]){
                    didswap++;
                }
            }
        }
        if(didswap != 0){
            System.out.println("Array is Not sorted");
            return false;
        }
        System.out.println("Array already sorted");
        return true;
    }
//------------blind Approach------------//
}
