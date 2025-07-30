package TUF.PracticeArrays;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(OptimalKadansAlgo(arr));
    }

    static int OptimalKadansAlgo(int[] arr){
        int Maxi = Integer.MIN_VALUE;
        int sum = 0;
        int ansS = -1;
        int ansE = -1;
        int start = -1;
        for (int i = 0; i < arr.length; i++) {
            if(sum == 0) start = i;
            sum = sum + arr[i];
            if(sum > Maxi){
                Maxi = sum;
                ansS = start;
                ansE = i;
            }
            if(sum<0) sum = 0;
        }
        for (int i = ansS; i <= ansE; i++) {
            System.out.println(arr[i]);
        }
        return sum;
    }


    //time complexity is O(n^2) and space complexity is O(1)
    static int maximBetter(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                max=Math.max(max,sum);
            }
        }
        return max;
    }

    //time complexity is O(n^3) and space complexity is O(1)
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
