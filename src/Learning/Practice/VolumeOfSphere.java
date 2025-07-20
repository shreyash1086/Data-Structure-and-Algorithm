package Learning.Practice;

import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the Sphere : ");
        int r = sc.nextInt();
        double PI = 3.14159;

        double volume = 1.3333333333*PI*r*r*r;

        System.out.println("The Volume of Sphere is "+volume);

    }
}
