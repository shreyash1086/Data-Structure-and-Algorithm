package Practice;

import java.util.Scanner;

public class CalculateDiscountOfProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Price of Product : ");
        int proPrice = sc.nextInt();
        System.out.print("Enter discount on Product in % : ");
        int proDis = sc.nextInt();

        double discount = proPrice * ((double) proDis /100 );

        double priceAfterDis = proPrice - discount;

        System.out.println(priceAfterDis);
    }
}
