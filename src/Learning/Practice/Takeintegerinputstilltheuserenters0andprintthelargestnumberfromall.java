package Learning.Practice;

import java.util.Scanner;

public class Takeintegerinputstilltheuserenters0andprintthelargestnumberfromall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        int largest = 0;
        int temp = 0;
        while(count !=0){
            System.out.print("Enter the Number : ");
            int Num = sc.nextInt();
            if(Num > temp){
                largest = Num;
                temp = Num;
            }
            else {
                largest = temp;
            }
            count = Num;

        }
        System.out.println("Largest is :"+largest);
    }
}
