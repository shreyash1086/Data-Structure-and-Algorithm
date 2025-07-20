package Learning.Practice;

import java.util.Scanner;

public class ProductOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int n2 = sc.nextInt();
        int res = mul(n1,n2);
        System.out.println("Multiplication is " + res);
    }
    static int mul(int a, int b){
        return a * b;
    }
}
