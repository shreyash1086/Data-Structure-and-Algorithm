package Learning.ArrayPractice;

public class IftotalTensEqualThirty {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 10, 10, 6, 10, 2};
        System.out.println(Check(arr));
    }
    static boolean Check(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 10){
                sum = sum + arr[i];
            }
        }
        boolean ans = sum == 30?true:false;
        return ans;
    }
}
