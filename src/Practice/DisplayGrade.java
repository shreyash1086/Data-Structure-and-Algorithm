package Practice;

import java.util.Scanner;

public class DisplayGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of subjects : ");
        int n = sc.nextInt();
        int total = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter marks for Subject "+ i + " ");
            total += sc.nextInt();
        }

        double percentage = ((double) total /  (n * 100)) * 100;
        System.out.println(percentage);

        if(percentage > 90 && percentage <= 100){
            System.out.println("AA");
        }else if(percentage > 80 && percentage <= 90){
            System.out.println("AB");
        }else if(percentage > 70 && percentage <= 80){
            System.out.println("BB");
        }else if(percentage > 60 && percentage <= 70){
            System.out.println("BC");
        }else if(percentage > 50 && percentage <= 60){
            System.out.println("CD");
        }else if(percentage > 40 && percentage <= 50){
            System.out.println("DD");
        }else {
            System.out.println("Fail");
        }
    }
}
