package LeetCode;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
//        String nStr = Integer.toString(num);
//        System.out.println(nStr.length());
          boolean res = isPal(num);
        System.out.println(res);
    }
    static boolean isPal(int n){
        String nStr = Integer.toString(n);
        String newN = "";
        for (int i = 1; i <= nStr.length(); i++) {
            newN += nStr.charAt(nStr.length()-i);
        }
        return nStr.equals(newN);
    }
}
