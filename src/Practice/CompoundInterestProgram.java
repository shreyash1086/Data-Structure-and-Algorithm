package Practice;

import java.util.Scanner;

public class CompoundInterestProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principle value invested : ");
        int princVal = sc.nextInt();
        System.out.print("Enter the interest rate in % : ");
        int tempForInterestRate = sc.nextInt();
        double InterestRate = (double)tempForInterestRate/100;
        System.out.print("enter the number of times interest is compounded per year : ");
        int n = sc.nextInt();
        System.out.print("enter time in year : ");
        int t = sc.nextInt();

        int pow = n*t;
        double rate_n = 1 + (InterestRate/n);
        double rhs = Math.pow(rate_n,pow);
        double res = princVal * rhs;
        double compoundInterest = res - princVal;
        System.out.println("Compound interest is "+compoundInterest);
    }
}
