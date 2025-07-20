package Algorithms.Linear_Search;

public class maxin2DArray {
    public static void main(String[] args) {
        int[][] array = {
                {23,1,4},
                {56,2,78},
                {45,89,54},
                {2,24,400,53,32,12},
                {78,51}
        };
        System.out.println(max(array));
    }
    static int max(int[][] array){
        int large = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (large < array[i][j]){
                    large = array[i][j];
                }
            }
        }
        return large;
    }
}
