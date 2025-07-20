package Learning.Practice;

import java.util.Scanner;

public class Takeintegerinputstilltheuserenters0andprintthesumofallnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        int sum = 0;
        while(count !=0){
            System.out.print("Enter the Number : ");
            int Num = sc.nextInt();
            count = Num;
            sum = sum + Num;
        }
        System.out.println("The Total Sum is "+ sum);
    }
}
