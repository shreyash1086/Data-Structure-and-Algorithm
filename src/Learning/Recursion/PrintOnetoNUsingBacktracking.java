package Learning.Recursion;

import java.util.Scanner;

public class PrintOnetoNUsingBacktracking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int N = sc.nextInt();
        prig(N,N);
    }
    static void prig(int i,int N){
        if(i<1){
            return;
        }
        prig(i-1,N);
        System.out.println(i);
    }
}
