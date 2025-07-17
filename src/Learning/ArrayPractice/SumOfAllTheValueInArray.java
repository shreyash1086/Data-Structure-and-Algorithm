package Learning.ArrayPractice;

public class SumOfAllTheValueInArray {
    public static void main(String[] args) {
        int[] arr = {-1,-2,-3};
        int sum = sumOfArray(arr);
        System.out.println(sum);
    }

    static int sumOfArray(int[] arr){
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        return sum;
    }
}
