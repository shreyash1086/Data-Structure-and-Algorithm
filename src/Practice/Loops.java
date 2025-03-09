package Practice;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("enter number");
        //for loop
//        for (int i =1;i<=n;i++){
//            System.out.println(i);
//        }
        //while loop

//        int j = 1;
//        while(j<=n){
//            System.out.println(j);
//            j++;
//        }

//        do-while
        int k=1;
        do{
            System.out.println(k);
            k++;
        }while (k>=n);
    }
}
