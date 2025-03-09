package Practice;
import java.util.Scanner;

public class CalculateElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Unit Consumed in kWh : ");
        int UnitCon = sc.nextInt();
        System.out.print("Enter the tariff rates the cost per units  of electricity : ");
        int tariff = sc.nextInt();
        System.out.print("Enter any fixed charges : ");
        int fixedCharge = sc.nextInt();
        System.out.print("Enter %Tax charges : ");
        int taxCharges = sc.nextInt();
        int billBeforeTax = (UnitCon * tariff);
        int billAfterfixedcharges = billBeforeTax + fixedCharge;
        double taxOnIT = ( (double) taxCharges / 100 ) * billBeforeTax;
        double result = billAfterfixedcharges + taxOnIT;
        System.out.println(result);
    }
}
