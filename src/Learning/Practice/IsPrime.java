package Learning.Practice;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check is it Prime or Not : ");
        int number = sc.nextInt();
        boolean result = isPrime(number);
        if (result){
            System.out.println(number +" is Prime number");
        }
        else {
            System.out.println("Not prime number");
        }
    }

    private static boolean isPrime(int n) {
        if(n <= 1) return false;
        int counter = 2;
        while(counter*counter< n){
            if(n%counter == 0){
                return false;
            }
            else counter++;
        }
        return counter * counter > n;
    }
}
