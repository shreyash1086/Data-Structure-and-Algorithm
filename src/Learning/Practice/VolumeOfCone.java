package Learning.Practice;

import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the base of cone : ");
        int r = sc.nextInt();
        System.out.print("Enter the height of the cone : ");
        int h = sc.nextInt();
        double PI = 3.14159;

        double volume = 0.33333333 * PI * r*r *h;

        System.out.println("The Volume of Cone is "+volume);
    }
}
