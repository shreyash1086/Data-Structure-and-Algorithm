package Practice;

import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of one side of the square : ");
        int side = sc.nextInt();

        double peri = 4 * side;

        System.out.println("The perimeter of the square is " + peri);
    }
}
