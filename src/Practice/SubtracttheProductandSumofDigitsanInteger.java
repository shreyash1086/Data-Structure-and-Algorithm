package Practice;

import java.util.Scanner;

public class SubtracttheProductandSumofDigitsanInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int number = sc.nextInt();
        int Temp = number;
        int Product = 1;
        int Sum = 0;
        while(number > 0){
            int rem = number % 10;
            Product = Product * rem;
            number /= 10;
        }
        System.out.println("The Product is "+Product);
        while(Temp > 0){
            int rem = Temp % 10;
            Sum = Sum + rem;
            Temp /= 10;
        }
        System.out.println("The Sum is "+Sum);

        int Result = Product - Sum;
        System.out.println("The Subtraction of the Product and Sum of Digit of an Integer is : "+Result);
    }
}
