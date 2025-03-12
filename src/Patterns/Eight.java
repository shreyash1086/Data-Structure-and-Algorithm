package Patterns;

public class Eight {
    public static void main(String[] args) {
        int n = 5;
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
