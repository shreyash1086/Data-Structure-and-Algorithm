package Practice;

import java.util.Scanner;

public class CalculateAverageOfNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of values you want to calculate average of : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the values : ");
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        double average =  (double) sum /arr.length;
        System.out.println("The average is : " + average);
    }
}
