package Linear_Search;

public class findMinimumNumber {
    public static void main(String[] args) {
        int[] arr = { 7897, 565, 65 , 4, 45, 454 , 562, 7895, 3 , 5};
        System.out.println(mini(arr));
    }
    static int mini(int[] arr){
        int small = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < small){
                small = arr[i];
            }
        }
        return small;
    }
}
