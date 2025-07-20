package TUF.PracticeArrays;

public class SearchIn2Darray {
    public static void main(String[] args) {
        int[][] arr = {{1}};
        System.out.println(search2(arr, 2));
    }

    //time complexity is
    static boolean search2(int[][] arr,int target){
        int i=0;
        for(i=0; i < arr.length; i++) { //O(n)
            if(target <= arr[i][arr[i].length-1]){
                break;
            }
            if(i == arr.length-1 && target >= arr[i][arr[i].length-1]){
                return false;
            }
        }

        for (int j = 0; j < arr[i].length; j++) { //O(m)
            if(arr[i][j] == target) return true;
        }

        return false;
    }

    //time complexity is O(n^2) and space complexity is O(1)
    static boolean search(int[][] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == target) return true;
            }
        }
        return false;
    }
}
