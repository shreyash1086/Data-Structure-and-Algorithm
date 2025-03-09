package Practice;

import java.util.Scanner;

public class PrimeOrNot{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        boolean res = isPrime(number);
        if(res){
            System.out.println("Number is Prime number ");
        }else {
            System.out.println("Number is Not Prime Number ");
        }
    }
    static boolean isPrime(int n){
     if(n <= 1){
         return false;
     }
     int i = 2;
     while (n > i){
         if(n % i == 0){
             return false;
         }else {
             i++;
         }
     }
     return n < i*i;
    }
}
