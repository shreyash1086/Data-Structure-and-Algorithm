package TUF.PracticeArrays;

import java.util.Arrays;

public class LeftrotateanarraybyDplaces {
    public static void main(String[] args) {
        int[] arr = {3,7,8,9,10,11};
        Optimal(arr,3);
    }

    //time complexity is o(n^2) and space complexity is O(1)
    static void BruteForce(int[] arr,int d) {
        if(arr.length == 0 || arr.length == 1){
            return;
        }
        for (int j = 0; j < d; j++) {
            for (int i = 0; i < arr.length-1; i++) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] =temp;
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    static void Optimal(int[] arr,int d){
        int n = arr.length;

        reverse( arr,0,d-1);
        reverse(arr, d,n-1);
        reverse(arr,0,n-1);

        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr,int start, int end){
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }


    //Time complexity - O(n+d)
    //Space complexity - O(d)
    static void BruteForce2(int[] arr,int d) {
        int n = arr.length;
        d = d%n; // this will give the remainder of d if d is larger than the length of the array so that we don't have to perform additional operations

        if(n <= 1){
            return;
        }

        int[] temp = new int[d]; // length is d because we are going to add initial d elements in to the temp.

        //putting first d element into the temp array
        for (int i = 0; i < temp.length; i++) { // time complexity = O(d)
            temp[i] = arr[i];
        }

        //shifting element to the left.
        for (int i = d; i < arr.length; i++) { //time complexity = O(n-d) - those are no of elements we are shifting
            arr[i-d] = arr[i];
        }

        //Put back the temp array element back to the end of the arr.

        for (int i = n-d; i < arr.length; i++) { //time complexity = O(d) - putting back d elements
            arr[i] = temp[i-(n-d)];
        }

        System.out.println(Arrays.toString(arr));


    }
}
