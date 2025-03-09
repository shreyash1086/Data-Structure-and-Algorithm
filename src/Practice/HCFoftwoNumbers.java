package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class HCFoftwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();
        int highfact1 = highfact(num1);
        System.out.println(highfact1);
        int highfact2 = highfact(num2);
        System.out.println(highfact2);
    }
    static int highfact(int n){
        int highFact = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0){
                highFact = i;
            }
        }
        return highFact;
    }
}
