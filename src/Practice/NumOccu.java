package Practice;

import java.util.Scanner;

public class NumOccu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int number = in.nextInt();
        System.out.print("Enter the Number whose occurence to be counted : ");
        int checkNumber = in.nextInt();
        int counter = 0;
        while (number > 0){
            int rem = number%10;
            if(rem == checkNumber){
                counter++;
                number /= 10;
            }
            else{
                number /= 10;
            }
        }
        System.out.println(counter);
    }
}
