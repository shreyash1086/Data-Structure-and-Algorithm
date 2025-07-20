package Learning.Practice;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int count = 10;
        while(count > 0){
            int Temp = b;
            b = a + b;
            a = Temp;
            System.out.println(b);
            count--;
        }
    }
}
