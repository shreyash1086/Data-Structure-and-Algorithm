package Patterns;

public class Seventeen {
    public static void main(String[] args) {
        int n = 4;
        seventeen(n);
    }
    static void seventeen(int n){
        for (int i = 0; i < n; i++) {
            char ch = 'A';
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print(ch);
                if(j >= (2*i+1)/2){
                    ch--;
                }else {
                    ch++;
                }
            }

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
