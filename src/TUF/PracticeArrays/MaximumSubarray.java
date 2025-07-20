package TUF.PracticeArrays;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(maxim(arr));
    }
    static int maxim(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = sum(arr,i,j);
                max=Math.max(max,sum);
            }
        }
        return max;
    }

    static int sum(int[] arr,int i,int j){
        int sum = 0;
        for (int k = i; k <= j; k++) {
            sum = sum+arr[k];
        }
        return sum;
    }
}
