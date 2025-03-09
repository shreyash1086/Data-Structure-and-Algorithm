package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        /*
        MultiDimensional array
        each index value in the in MD array is an array

                exm : 1 2 3
                      4 5 6
                      7 8 9
                      it has 3 rows and 3 column
        */

//        int[][] mulArr = {
//                {1,2,3},
//                {4,5},
//                {7,8,5,9,3},
//                {9}
//        };
//
//        System.out.println(mulArr.length); // Gives number of rows in MDarray;
//
//        for (int i = 0; i < mulArr.length; i++) {
//            for (int j = 0; j < mulArr[i].length; j++) {
//                System.out.print(mulArr[i][j]);
//            }
//            System.out.println();
//        }

        Scanner sc = new Scanner(System.in);

        int[][] arrayMD= new int[3][3];

        for (int i = 0; i < arrayMD.length; i++) {
            for (int j = 0; j < arrayMD[i].length; j++) {
                arrayMD[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < arrayMD.length; i++) {
            for (int j = 0; j < arrayMD[i].length; j++) {
                System.out.print(arrayMD[i][j] + " ");
            }
            System.out.println();
        }

    }
}
