package Practice;

import java.util.Scanner;

public class NumRev {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int number = in.nextInt();
        int newNumber = 0;
        while(number > 0){
            int rem = number % 10;
            newNumber = newNumber * 10 +rem;
            number /= 10;
        }
        System.out.println("Reversed Number is "+newNumber);
    }
}
