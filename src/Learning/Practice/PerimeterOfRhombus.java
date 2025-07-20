package Learning.Practice;

import java.util.Scanner;

public class PerimeterOfRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the side of rectangle : ");
        int side = sc.nextInt();

        double peri = 4* side;

        System.out.println("The Perimeter of the triangle is Rhombus : "+peri);
    }
}
