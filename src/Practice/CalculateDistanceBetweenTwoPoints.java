package Practice;

import java.util.Scanner;

public class CalculateDistanceBetweenTwoPoints {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number : ");
    int baseNum = sc.nextInt();
    System.out.print("Enter the exponential value : ");
    int expo = sc.nextInt();
    double result = Math.pow(baseNum,expo);
        System.out.println("The "+baseNum+" to the power "+expo+ " is "+result);
    }
}
