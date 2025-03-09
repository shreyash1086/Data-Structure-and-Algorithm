package Practice;

import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the base of the parallelogram : ");
        int base = sc.nextInt();
        System.out.print("Enter the length of the side of the parallelogram : ");
        int side = sc.nextInt();

        double peri =2 * (base + side);

        System.out.println("The perimeter of the parallelogram is "+ peri);
    }
}
