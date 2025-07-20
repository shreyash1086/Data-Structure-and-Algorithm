package Learning.Patterns;

public class Thirteen {
    public static void main(String[] args) {
        int n = 5;
        thirteen(n);
    }

     static void thirteen(int n) {
        int num = 1;
         for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++){
                System.out.print(" "+num);
                num++;
            }
             System.out.println();
         }
    }
}
