package Learning.Patterns;

public class Third {
    public static void main(String[] args) {
        int n = 5;
        int i =1;
        for (int j = 0; j < n; j++) {
            for (int k = 0; k <= j; k++) {
                System.out.print(i);
                i++;
            }
            i=1;
            System.out.println();
        }
    }
}
