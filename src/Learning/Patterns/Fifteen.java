package Learning.Patterns;

public class Fifteen {
    public static void main(String[] args) {
        int n = 5;
        fifteen(n);
    }
    static void fifteen(int n){
        for (int i = 0; i < n; i++){
            char ch = 'A';
            for (int j = 0; j < n - i; j++) {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
