package Practice;

import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of a side of the equilateral triangle : ");
        int a = sc.nextInt();

        double peri = 3*a;

        System.out.println("The Perimeter of a equilateral triangle is "+ peri);
    }
}
