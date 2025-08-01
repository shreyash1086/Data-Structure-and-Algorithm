package TUF.PracticeArrays;

public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        int[] arr = {2,4,1};
        System.out.println(Optimal(arr));
    }

    static int Optimal(int[] arr){
        int mini = arr[0];
        int profit = 0;
        for(int i=1;i<arr.length;i++){
            int cost = arr[i]-mini;
            profit=Math.max(profit,cost);
            mini=Math.min(mini,arr[i]);
        }
        return profit;
    }

    static int average(int[] arr){
        int bp = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]>arr[i]){
                    bp=Math.max(bp,arr[j]-arr[i]);
                }
            }
        }
        return bp;
    }
    static int besttime(int[] arr){
        int index = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
                index = i;
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = index; i < arr.length; i++) {
            max=Math.max(max,arr[i]);
        }

        return max-min;
    }
}
