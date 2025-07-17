package GeeksForGeeks;

public class MoveAllZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {1,2,0,3,4,0,8,0,9};
        MAZE3(arr);
        for(int x: arr ){
            System.out.println(x);
        }
    }

    //solution 1 - with the new array where time and space complexity is o(n)
    static void MAZE(int[] arr){
        int[] arr2 = new int[arr.length];
        int j = 0;
        for(int i = 0;i < arr.length; i++){
            if(arr[i] != 0){
                arr2[j] = arr[i];
                j++;
            }
        }
        while (j < arr2.length){
            arr2[j] = 0;
            j++;
        }
        for(int x: arr2 ){
            System.out.println(x);
        }
     }

    //solution 2
    static void MAZE2(int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                arr[count] = arr[i];
                count++;
            }
        }
        while(count < arr.length){
            arr[count] = 0;
            count++;
        }
        for(int x: arr){
            System.out.println(x);
        }
    }

    //solution 3
    static void MAZE3(int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;

                count++;
            }
        }
    }
}
