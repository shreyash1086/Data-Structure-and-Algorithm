package Learning.Recursion;

public class FibonacciNumber {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(fibN(n-1)+fibN(n-2));
    }
    static int fibN(int n){
        if(n<=1) return n;
        return fibN(n-1)+fibN(n-2);
    }

    static int fibFor(int n){
        int[] arr = new int[30];
        arr[0] = 0;
        arr[1] = 1;
        for(int k = 2;k<arr.length;k++){
            arr[k] = arr[k-1]+arr[k-2];
        }
        return arr[n-1]+arr[n-2];
    }
}
