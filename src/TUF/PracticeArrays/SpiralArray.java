package TUF.PracticeArrays;

import java.util.ArrayList;

public class SpiralArray {
    public static void main(String[] args) {

    }

    //time O(m*n) - every element are printed
    //space O(m*n)
    static void spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0, right = n-1;
        int top = 0, bottom = m-1;

        ArrayList<Integer> ls = new ArrayList<>(); //space O(m*n)

        //time O(m*n) - every element are printed
        while (top <= bottom && left <= right) {
            //right
            for (int i = left; i <= right; i++) {
                ls.add(matrix[top][i]);
            }
            top++;

            //bottom
            for (int i = top; i <= bottom; i++) {
                ls.add(matrix[i][right]);
            }
            right--;

            //left
            if(top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ls.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left <= right) {
                //top
                for (int i = bottom; i >= top; i--) {
                    ls.add(matrix[i][left]);
                }
                left++;
            }
        }
    }
}
