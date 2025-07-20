package Learning.Practice;

import java.util.Scanner;

public class Findifanumberispalindromeornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        boolean res = palindrome(number);
        if (res){
            System.out.println("Number is palindrome");
        }else{
            System.out.println("Number is not palindrome");
        }
    }
    static boolean palindrome(int n){
        int newN = 0;
        int temp = n;
        while (n > 0){
            int rem = n % 10;
            newN = newN * 10 + rem;
            n /= 10;
        }
        return newN == temp;
    }
}
