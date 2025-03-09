package Practice;

import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of values you want to sum : ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("enter the "+(i+1)+" number : ");
            int number = sc.nextInt();
            sum +=number;
        }

        System.out.println("The sum of "+n+" number is "+ sum);

    }
}
