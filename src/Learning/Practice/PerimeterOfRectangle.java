package Learning.Practice;

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of rectangle : ");
        int length = sc.nextInt();
        System.out.print("Enter the width of rectangle : ");
        int width = sc.nextInt();

        double peri = 2 * (length+width);

        System.out.println("There perimeter of rectangle is "+peri);
    }
}
