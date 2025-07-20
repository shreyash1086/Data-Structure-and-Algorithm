package Learning.Practice;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base of triangle : ");
        int base = sc.nextInt();
        System.out.print("Enter the height of triangle : ");
        int height = sc.nextInt();

        double area = 0.5*base*height;

        System.out.println("the area of triangle is "+area);
    }
}
