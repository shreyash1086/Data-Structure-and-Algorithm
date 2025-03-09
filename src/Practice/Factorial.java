package Practice;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int res = factorial(n);
        System.out.println("Factorial is "+res);
    }
    static int factorial(int n){
        int temp = n;
        for (int i = 1; i < n; i++) {
            temp *= (n-i);
        }
        return temp;
    }
}
