package Practice;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius of Circle : ");
        int r = sc.nextInt();
        double PI = 3.14159;
        double area = PI * r * r;
        System.out.println(area);
    }
}
