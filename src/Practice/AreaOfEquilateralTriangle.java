package Practice;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of a side of the equilateral triangle : ");
        int a = sc.nextInt();

        double area = (Math.sqrt(3)/4) * a*a;

        System.out.println("The area of equilateral triangle is : "+ area);
    }
}
