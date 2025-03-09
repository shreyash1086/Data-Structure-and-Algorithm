package Practice;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of rectangle : ");
        int length = sc.nextInt();
        System.out.print("Enter the width of rectangle : ");
        int width = sc.nextInt();

        int area = length * width;

        System.out.println("the area of rectangle is "+area);

    }
}
