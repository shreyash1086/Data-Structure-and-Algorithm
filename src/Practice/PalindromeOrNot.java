package Practice;

import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        boolean res = isPalindrome(n);
        if (res){
            System.out.println("Its an Palindrome number ");
        }else {
            System.out.println("Its not an Palindrome number ");
        }
    }
    static boolean isPalindrome(int n){
        int temp = n;
        int NewNum = 0;
        while(n > 0){
            int rem = n % 10;
            NewNum = NewNum * 10 + rem;
            n /= 10;
        }
        return temp == NewNum;
    }
}
