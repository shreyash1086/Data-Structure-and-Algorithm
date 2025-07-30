package Learning.Recursion;

import java.util.Scanner;

public class PrintingNtoOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int N = sc.nextInt();
        print(1,N);
    }
    static void print(int i,int N){
        if(i>N) return;
        print(i+1,N);
        System.out.println(i);
    }
}
