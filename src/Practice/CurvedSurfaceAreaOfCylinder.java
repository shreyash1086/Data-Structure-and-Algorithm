package Practice;

import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circular base of the cylinder : ");
        int r = sc.nextInt();
        System.out.println("Enter the Height of the cylinder : ");
        int h = sc.nextInt();
        double PI = 3.14159;

        double CSA = 2*PI*r*h;

        System.out.println("The Curved Surface Area Of Cylinder is "+CSA);
    }
}
