package Learning.ArrayPractice;

public class FindIndexOfElement {
    public static void main(String[] args) {
        int[] arr = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int val = 29;
        System.out.println("Index position is "+Search(arr, val));
    }

    static int Search(int[] arr,int element){

        if(arr == null){
            return -1;
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == element){
                return i;
            }
        }
        return -1;
    }


}
