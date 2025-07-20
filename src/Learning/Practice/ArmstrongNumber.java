package Learning.Practice;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int number = sc.nextInt();
        boolean res = armstrong(number);
        if(res){
            System.out.print("Number is armstrong number");
        }else{
            System.out.println("Not an armstrong number");
        }
    }
    static boolean armstrong(int n){
        int temp = n;
        String str = Integer.toString(n);
        double newval = 0;
        while (n > 0){
            int rem = n % 10;
            newval = newval + Math.pow(rem,str.length());
            n /= 10;
        }
        return newval == temp;
    }
}
