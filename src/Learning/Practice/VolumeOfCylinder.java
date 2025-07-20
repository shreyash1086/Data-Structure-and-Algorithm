package Learning.Practice;

import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circular base : ");
        int r = sc.nextInt();
        System.out.print("Enter the height of the cylinder : ");
        int h = sc.nextInt();
        double PI= 3.14159;

        double volume = PI * r*r * h;

        System.out.println("The volume of cylinder is "+volume);

    }
}
