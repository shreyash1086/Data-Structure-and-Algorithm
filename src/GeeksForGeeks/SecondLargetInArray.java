package GeeksForGeeks;

public class SecondLargetInArray {
    public static void main(String[] args) {
        int[] arr = {10,10,10};
        System.out.println(largest(arr));
    }
    static int largest(int[] arr){
        int large = arr[0];
        int secondLarge =-1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]>large){
                large = arr[i];
            }else if(arr[i] > secondLarge && arr[i] != large){
                secondLarge = arr[i];
            }
        }
        return  secondLarge;
    }
}
