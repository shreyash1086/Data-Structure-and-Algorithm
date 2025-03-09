package Practice;

import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the of Prism :");
        System.out.println("Enter 1 for Rectangular Prism : ");
        System.out.println("Enter 2 for Triangular Prism : ");
        System.out.println("Enter 3 for Square Prism : ");
        double result =0;
        int value = sc.nextInt();
        if(value == 1){
            System.out.println("Enter the length of rectangle : ");
            int length = sc.nextInt();
            System.out.println("Enter the Width of rectangle : ");
            int width = sc.nextInt();
            System.out.println("Enter the Height of Prism : ");
            int HeightPrism = sc.nextInt();
            int res1 = length*width*HeightPrism;
            result = res1;
        } else if (value == 2) {
                    System.out.println("Enter the Base of Triangle : ");
                    int base = sc.nextInt();
                    System.out.println("Enter the Height of Triangle : ");
                    int height = sc.nextInt();
                    System.out.println("Enter the Height of Prism : ");
                    int HeightPrism = sc.nextInt();
                    double res2 = 0.5*base*height*HeightPrism;
                    result = res2;
                } else if (value == 3) {
                            System.out.println("Enter the side of Square : ");
                            int side = sc.nextInt();
                            System.out.println("Enter the Height of Prism : ");
                            int HeightPrism = sc.nextInt();
                            double res3 = side*side * HeightPrism;
                            result = res3;
                        }

        System.out.println(result);
    }
}
