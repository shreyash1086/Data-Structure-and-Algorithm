package Learning.Practice;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int n2 = sc.nextInt();
        System.out.print("Enter the third number : ");
        int n3 = sc.nextInt();

        int max = largest(n1,n2,n3);
        int min = smallest(n1,n2,n3);

        System.out.println("Largest is "+max);
        System.out.println("Smallest is "+min);
    }
    static int largest(int a,int b, int c){
        int large = 0;
        if(a > b && a > c){
            large = a;
        }else if(b > c){
            large = b;
        }else {
            large = c;
        }
        return large;
    }

    static int smallest(int a, int b, int c){
        int small = 0;
        if(a < b && a < c){
            small = a;
        }else if(b < c){
            small = b;
        }else {
            small = c;
        }
        return small;
    }
}
