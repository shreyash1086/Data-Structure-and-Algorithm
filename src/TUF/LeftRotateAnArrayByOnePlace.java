package TUF;

import javax.swing.*;

public class LeftRotateAnArrayByOnePlace {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,1,2};
        for(int x: arr){
            System.out.print(x+" ");
        }
        System.out.println("before");
//        int[] sol = brute(arr);
        optimal(arr);
        for(int x: arr){
            System.out.print(x+" ");
        }
        System.out.println("after");

    }


//------------Optimal Solution------------//

//    Time Complexity	O(N) (Each element shifts once)
//    Space Complexity	O(1) (No extra array used)
    
    static void optimal(int[] arr){
        int start = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = start;
    }

//------------Optimal Solution------------//

//------------MyApproach Solution------------//

//    time Complexity O(n^2)
//    space Complexity O(1)

    static void leftRotate(int[] arr){
        int i = 0;
            for (int j = arr.length-1; j >=1; j--) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
    }

//------------MyApproach Solution------------//


//------------Brute Force Solution------------//
//Not efficient as it using swapping instead of rotating
    //Time O(N)
    //Space O(1)

    static int[] brute(int[] arr){
        int[] newArr = new int[arr.length];
        for (int i = 1; i < newArr.length; i++) {
            newArr[i-1] = arr[i];
        }
        newArr[arr.length-1] = arr[0];

        return newArr;
    }

//------------Brute Force Solution------------//


}
