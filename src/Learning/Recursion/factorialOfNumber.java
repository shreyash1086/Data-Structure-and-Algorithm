package Learning.Recursion;

public class factorialOfNumber {
    public static void main(String[] args) {
        System.out.println(fact(6));
    }
    static int fact(int n){
        if(n==1) return 1;
        return n*fact(n-1);
    }
}
