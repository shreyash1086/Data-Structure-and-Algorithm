package Learning.Practice;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        eveOdd(num);
    }
    static void eveOdd(int n){
        if(n % 2 == 0){
            System.out.println(n + " is Even Number");
        }
        else {
            System.out.println(n + " is Odd Number");
        }
    }
}
