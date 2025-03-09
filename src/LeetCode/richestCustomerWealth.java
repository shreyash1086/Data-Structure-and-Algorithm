package LeetCode;

public class richestCustomerWealth {
    public static void main(String[] args) {
        int[][] array = { {1,5},{7,3},{3,5}};
        int large = maximumWealth(array);
        System.out.println(large);
    }
    static int maximumWealth(int[][] array){
        int large = 0;
        for(int i = 0; i < array.length; i++){
            int sum = 0;
            for(int j = 0; j < array[i].length;j++){
                sum += array[i][j];
            }
            if(large < sum){
                large = sum;
            }
        }
        return large;
    }
}
