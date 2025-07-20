package Learning.Practice;

import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base area of pyramid : ");
        int baseArea = sc.nextInt();
        System.out.println("Enter the Height of the pyramid : ");
        int h = sc.nextInt();

        double volume = 0.3333333333*baseArea*h;

        System.out.println("The volume of Pyramid is "+volume);
    }
}
