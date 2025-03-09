package Practice;

import java.util.Scanner;

public class Circum_AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle : ");
        double r = sc.nextInt();
        circum(r);
        area(r);
    }

    private static void area(double r) {
        double PI = 3.14159;
        double area = PI * r * r;
        System.out.println("Area of Circle is " + area);
    }

    private static void circum(double r) {
        double PI = 3.14159;
        double cir = 2 * PI * r;
        System.out.println("Circumference of Circle is " + cir);
    }
}
