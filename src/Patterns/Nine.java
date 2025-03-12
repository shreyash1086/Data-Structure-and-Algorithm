package Patterns;

public class Nine {
    public static void main(String[] args) {
        int n = 5;
        pattern7(n);
        pattern8(n);
    }
    static void pattern7(int n){
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n - i - 1; j++){
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for(int j = 0; j < n - i - 1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern8(int n){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for (int j = 0; j < n-i*2+4; j++){
                System.out.print("*");
            }
            for (int j = 0; j < i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
