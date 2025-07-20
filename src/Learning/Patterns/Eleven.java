package Learning.Patterns;

public class Eleven {
    public static void main(String[] args) {
        int n = 5;
        eleven(n);
    }

     static void eleven(int n) {
        int num = 1;
         for (int i = 1; i <= n; i++) {
             if(i%2 == 0) num = 0;
             else num = 1;
             for (int j = 1; j <= i; j++) {
                 System.out.print(num);
                 num = 1 - num;
             }
             System.out.println();
         }
    }
}
