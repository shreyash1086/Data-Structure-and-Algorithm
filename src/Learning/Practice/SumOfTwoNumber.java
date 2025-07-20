package Learning.Practice;

import java.util.Scanner;

public class SumOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1 : ");
        int n1 = sc.nextInt();
        System.out.print("Enter the number 2 : ");
        int n2 = sc.nextInt();
        int res = sum(n1,n2);
        System.out.println("Addition is "+ res);
    }
    static int sum(int a , int b){
        return a + b;
    }
}
