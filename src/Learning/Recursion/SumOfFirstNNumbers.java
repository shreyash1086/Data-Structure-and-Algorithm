package Learning.Recursion;

import java.util.Scanner;

public class SumOfFirstNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
//        sum(n,0);
        System.out.println(sum2(n));
    }
    //parameterized
    static void sum(int i,int sum) {
        if(i==0){
            System.out.println(sum);
            return;
        }
        sum(i-1,sum+i);
    }
    //Functional
    static int sum2(int n){
        if(n==0) return 0;
        return n+sum2(n-1);
    }
}
