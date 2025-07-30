package Learning.Recursion;

import java.util.Scanner;

public class PrintName {

    //time complexity is O(n) and space O(n) for stack space
    public static void main(String[] args) {
//        Print("shreyash",0);
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the Name : ");
//        String name = sc.next();
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        PrintN(1,num);
    }
    static void PrintN(int i, int N){
        if(i>N) return;
        System.out.println("shreyash");
        PrintN(i+1,N);
    }
    static void Print(String str,int cnt){
        if(cnt == 0) return;
        System.out.println(str);
        cnt--;
        Print(str,cnt);
    }
}
