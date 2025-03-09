package Practice;

import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base of parallelogram : ");
        int base = sc.nextInt();
        System.out.print("Enter the height of parallelogram : ");
        int height = sc.nextInt();

        int area = base * height;

        System.out.println("the area of parallelogram is "+area);

    }
}
