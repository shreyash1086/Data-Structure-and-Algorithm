package TUF.PracticeArrays;

public class SecondLargestAndSecondSmallest {
    public static void main(String[] args) {
        int[] arr = {1,5};
        result(arr);
    }
    static void result(int[] arr){

        if (arr.length == 0 || arr.length == 1){
            System.out.println("Cannot find");
            return;
        }

        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > large){
                secondLarge = large;
                large = arr[i];
            }else if(arr[i]>secondLarge && arr[i] != large){
                secondLarge = arr[i];
            }

            if(arr[i] < small){
                secondSmall = small;
                small = arr[i];
            }else if (arr[i] < secondSmall && arr[i] != small){
                secondSmall = arr[i];
            }
        }

        System.out.println("Second Largest is "+secondLarge);
        System.out.println("Second Smallest is "+secondSmall);

    }
}
