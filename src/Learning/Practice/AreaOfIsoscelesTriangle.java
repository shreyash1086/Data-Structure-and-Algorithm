package Learning.Practice;

import java.util.Scanner;

public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Base of isosceles triangle : ");
        int base = input.nextInt();
        System.out.print("Enter the Side of isosceles triangle : ");
        int Side = input.nextInt();

        double area = 0.25*base*Math.sqrt((4*Side*Side)-base*base);

        System.out.println("The are of isosceles triangle "+area);
    }
}
