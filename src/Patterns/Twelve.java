package Patterns;

public class Twelve {
    public static void main(String[] args) {
        int n = 9;
        for (int i = 0; i < n; i++) {
            int temp = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(temp);
                temp++;
            }

            for (int j = 0; j < n-i-1; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j <= i; j++) {
                temp--;
                System.out.print(temp);
            }
            System.out.println();
        }
    }
}
