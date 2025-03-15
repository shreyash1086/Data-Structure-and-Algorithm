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
        leftRotate(arr);
        for(int x: arr){
            System.out.print(x+" ");
        }
        System.out.println("after");

    }

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

//------------Optimal Solution------------//



//------------Optimal Solution------------//

}
