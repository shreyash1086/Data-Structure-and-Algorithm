package Learning.Recursion;

public class PrintOneToN {
    public static void main(String[] args) {
        printN(99);
    }
    static void print(int i,int N){
        if(i>N) return;
        System.out.println(i);
        print(i+1,N);
    }
    static void printN(int N){
        if(N<1) return;
        System.out.println(N);
        N--;
        printN(N);
    }
}
