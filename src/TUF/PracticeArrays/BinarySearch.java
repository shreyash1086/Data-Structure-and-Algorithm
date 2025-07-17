package TUF.PracticeArrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = 3;

        System.out.println(linearSearch(arr,n));
    }

    //time complexity - best - O(1)
//                      worst - O(n)

     static int linearSearch(int[] arr,int n) {
         for (int i = 0; i < arr.length; i++) {
             if(arr[i] == n){
                 return i;
             }
         }
         return -1;
    }
}
