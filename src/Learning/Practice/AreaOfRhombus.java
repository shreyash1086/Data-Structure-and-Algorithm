package Learning.Practice;

import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of diagonal 1 : ");
        int diagonal1 = sc.nextByte();
        System.out.print("Enter the length of diagonal 2 : ");
        int diagonal2 = sc.nextByte();

        double area = 0.5 * diagonal1 * diagonal2;

        System.out.println("The area of Rhombus is : "+ area);
    }
}
