package Learning.Practice;

import java.util.Scanner;

public class FindNcr_Npr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of item : ");
        int n = sc.nextInt();
        System.out.print("Enter the number of item you want to choose : ");
        int r = sc.nextInt();
        int factN = factX(n);
        int factR = factX(r);
        int sub = n - r;
        int factN_R = factX(sub);
        double resNcR = nCr(factN,factR,factN_R);
        System.out.println("nCr is "+ resNcR);
        double resNpR = nPr(factN,factN_R);
        System.out.println("nPr is "+ resNpR);

    }
     static int factX(int n) {
        int temp = n;
        for (int i = 1; i < n; i++) {
            temp = temp * (n-i);
        }
        return temp;
    }
    static double nCr(int factN,int factR,int factN_R){
        double nCr = (double) factN / (factR * factN_R);
        return nCr;
    }

    static double nPr(int factN,int factN_R){
        double nPr = (double) factN / factN_R;
        return nPr;
    }
}
