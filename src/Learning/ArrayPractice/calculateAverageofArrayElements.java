package Learning.ArrayPractice;

public class calculateAverageofArrayElements {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        int avg = Average(arr);
        System.out.println(avg);
    }

    static int Average(int[] arr){
        int average = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        average = sum/arr.length;
        return  average;
    }
}
