package Practice;

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int n2 = sc.nextInt();
        System.out.print("Enter third number : ");
        int n3 = sc.nextInt();

        isPythagoreanTriplet(n1,n2,n3);
    }
    static void isPythagoreanTriplet(int a, int b, int c){
        if( (a*a + b*b) == c*c){
            System.out.println("Its an Triplet");
        }
        else {
            System.out.println("Not an Triplet");
        }
    }
}
