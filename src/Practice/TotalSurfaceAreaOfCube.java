package Practice;

import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the side of the cube : ");
        int side = sc.nextInt();
        int TSA = 6 * side*side;
        System.out.println("total surface area of a cube is "+TSA);
    }
}
