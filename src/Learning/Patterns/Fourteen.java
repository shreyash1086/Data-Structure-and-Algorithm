package Learning.Patterns;

public class Fourteen {
    public static void main(String[] args) {
        int n = 5;
        fourteen(n);
    }
    static void fourteen(int n) {
        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
