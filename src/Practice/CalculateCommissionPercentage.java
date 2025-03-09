package Practice;

import java.util.Scanner;

public class CalculateCommissionPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Sales Amount : ");
        int salesAmount = sc.nextInt();
        System.out.print("Enter the Commission rate : ");
        int commissionAmount = sc.nextInt();
        double commissionPercentage = ((double) commissionAmount/salesAmount) * 100;
        System.out.println("The Commission percentage is " + commissionPercentage);
    }
}
