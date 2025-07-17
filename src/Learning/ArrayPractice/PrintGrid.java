package Learning.ArrayPractice;

import java.util.Scanner;

public class PrintGrid {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        grid(a,b);
    }

    static void grid(int a, int b){

        Scanner sc = new Scanner(System.in);

        char[][] arr = new char[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = '_';
            }
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
