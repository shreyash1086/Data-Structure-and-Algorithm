package Learning.Practice;

import java.util.Scanner;

public class CalculateDepreciationofValue {
    //Depreciation refers to the reduction in the value of an asset over time, typically due to wear and tear, usage, age, or obsolescence.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost of asset : ");
        int costAsset = sc.nextInt();
        System.out.print("Enter the salvage value : "); //Salvage Value: The estimated value of the asset at the end of its useful life.
        int salvageVal = sc.nextInt();
        System.out.print("Enter the expected time the asset will be in service per year : "); //Useful Life: The expected time (in years or units) the asset will be in service.
        int usefulLife = sc.nextInt();

        int DepriciationValue = ( costAsset - salvageVal )/usefulLife;

        System.out.println("Depreciation value is "+DepriciationValue+ " per year");
    }
}
