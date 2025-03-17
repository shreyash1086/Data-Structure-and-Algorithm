package TUF;

public class LeftRotateAnArrayByNplaces {
    public static void main(String[] args) {
        int[] arr = {5,6,7,9,12,15,21};
        int n = 3;
//        BruteForceSol(arr,n);
//        for(int x : arr){
//            System.out.print(x+" ");
//        }

        int[] newarr = Brute(arr,n);
        for (int x: newarr){
            System.out.print(x+" ");
        }
    }


//    Time Complexity = O(n^2)
//    Space Complexity = O(1);

    static void BruteForceSol(int[] arr, int n){
        for (int i = 0; i < n; i++) {
            int start = arr[0];
            for (int j = 0; j < arr.length-1; j++) {
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = start;
        }
    }
    
}
