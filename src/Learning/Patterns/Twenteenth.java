package Learning.Patterns;

public class Twenteenth {
    public static void main(String[] args) {
        int n = 20;
        part1(n);
    }
    static void part1(int n){
        for (int i = 0; i < n*2-1; i++) {
            if (i<n){
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j < n-i-1; j++) {
                    System.out.print("  ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }else {
                for (int j = 0; j < n*2-i-1; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j < i+1-n; j++) {
                    System.out.print("  ");
                }
                for (int j = 0; j < n*2-i-1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
