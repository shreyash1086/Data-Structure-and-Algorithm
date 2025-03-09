package Practice;

import java.util.Scanner;

public class PrimeNumbersBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int n1 = sc.nextInt();
        System.out.print("Enter number 2 : ");
        int n2 = sc.nextInt();

        prime(n1,n2);
    }
    static void prime(int a, int b){
        int count = 2;
        for (int j = a + 1; j < b; j++) {
            if(j <=1){
                j++;
            }
            while (count < j){
                if(j % count == 0){
                    count++;
                }else {
                    j++;
                }
            }
        }
    }
}
