package Learning.Practice;

import java.util.Scanner;

public class EligibleForVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age of Person : ");
        int age = sc.nextInt();
        isEligible(age);
    }
    static void isEligible(int n){
        if(n >= 18){
            System.out.println("Eligible for Vote ");
        }else {
            System.out.println("Not eligible for Vote ");
        }
    }
}
