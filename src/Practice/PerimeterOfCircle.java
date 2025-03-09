package Practice;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle : ");
        int r = sc.nextInt();
        double PI = 3.14159;
        double peri = 2 * PI * r;

        System.out.println("The Perimeter of Circle is "+peri);
    }
}
