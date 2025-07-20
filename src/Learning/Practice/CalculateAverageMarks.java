package Learning.Practice;

import java.util.Scanner;

public class CalculateAverageMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of subject : ");
        int n = sc.nextInt();
        System.out.println("enter mark of each subject ");
        int[] subjMark = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the "+(i+1)+" subjects mark : ");
            subjMark[i]=sc.nextInt();
        }
        int sum = 0;
        for(int x : subjMark){
            sum += x;
        }

        int average = sum / n;

        System.out.println("the average is : "+average);
    }
}
