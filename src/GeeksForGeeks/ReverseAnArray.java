package GeeksForGeeks;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 6, 5};
        reverse2(arr);
        for(int x : arr){
            System.out.println(x+" ");
        }
    }
//first approach - using new array
    static void reverse1(int[] arr){
        int[] arr2 = new int[arr.length];
        int j = 0;
        for (int i = arr.length-1;i>=0;i--){
            arr2[j] = arr[i];
            j++;
        }

        for(int x : arr2){
            System.out.println(x+" ");
        }
    }

//    second approach - two pointer approach
    static void reverse2(int[] arr){
        int i = 0;
        int j = arr.length-1;

        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
