package Learning.Patterns;

public class Ten {
    public static void main(String[] args) {
        int n = 5;
        ten(n);
    }
    static void ten(int n){
        for (int i = 1; i <= n*2-1; i++){
            int star = i;
            if(i > n) star = 2*n-i;
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
