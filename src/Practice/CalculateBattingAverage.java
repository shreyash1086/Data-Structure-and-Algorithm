package Practice;

import java.util.Scanner;

public class CalculateBattingAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of runs the batsman Scored : ");
        int Totalruns = sc.nextInt();
        System.out.print("Enter Number of time the batsman got dismissed : ");
        int noOfTimeOut = sc.nextInt();

        int average = Totalruns / noOfTimeOut;

        System.out.println("The Batting Average is "+average);
    }
}
