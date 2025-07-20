package Learning.Practice;

import java.util.Objects;
import java.util.Scanner;

public class CalculateCGPAJavaProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of subject in a semester : ");
        int n = sc.nextInt();
        System.out.println("Enter the credits for points each subject");
        int[] creditPt = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("enter the credit point for subject no "+ (i+1) +" : ");
            creditPt[i] = sc.nextInt();
        }
        int sumOfCreditPT = 0;
        for(int x : creditPt){
            sumOfCreditPT += x;
        }
//        System.out.println("the sum of credit points is "+ sumOfCreditPT);

        String[] grade = new String[n];
        for (int j = 0; j < n; j++) {
            String temp = "";
            System.out.print("Enter the grade for "+ (j+1) + " subject : ");
            temp = sc.next();
            grade[j] = temp.toLowerCase();
        }

        int[] gradePoints = new int[n];

        for (int k = 0; k < n; k++) {
            if(Objects.equals(grade[k], "aa")){
                gradePoints[k] = 10;
            }else if(Objects.equals(grade[k], "ab")){
                gradePoints[k] = 9;
            }else if(Objects.equals(grade[k], "bb")){
                gradePoints[k] = 8;
            }else if(Objects.equals(grade[k], "bc")){
                gradePoints[k] = 7;
            }else if(Objects.equals(grade[k], "cc")){
                gradePoints[k] = 6;
            }else if(Objects.equals(grade[k], "cd")){
                gradePoints[k] = 5;
            }else if(Objects.equals(grade[k], "dd")){
                gradePoints[k] = 4;
            }else{
                gradePoints[k] = 0;
            }
        }
        int sumOfcredit_grade = 0;
        for (int x = 0; x < n; x++) {
            sumOfcredit_grade = creditPt[x] * gradePoints[x];
        }

        double CGPA = (double) sumOfcredit_grade/sumOfCreditPT;
        System.out.println("CGPA is "+ CGPA);
    }
}
