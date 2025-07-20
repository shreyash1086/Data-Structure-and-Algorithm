package Learning.Practice;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = in.nextInt();
        int temp = number;
        int reverserd =0;
        while(number >0){
            int rem = number%10;
            reverserd = reverserd *10 +rem;
            number /= 10;
        }
        System.out.println("reversed String is "+reverserd);

        if(reverserd == temp){
            System.out.println("Number is palendrome");
        }else{
            System.out.println("Number is not palindrome");
        }
    }
}
