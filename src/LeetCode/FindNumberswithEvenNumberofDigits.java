package LeetCode;

public class FindNumberswithEvenNumberofDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,-7896};
        int res = findNumbers(nums);
//        System.out.println(res);
        System.out.println(digit(-5050));
    }

    // method to find if i th element contain even digit or not
    static int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    // method to check the returned count of the digit method if its even return true else false
    static boolean even(int num) {
        return digit(num) % 2 == 0;
    }

    // method to get the number of digit each number has
    static int digit(int num){
        if(num < 0){
            num *=-1;
        }
        int count = 0;
        while(num>0){
            count++;
            num /= 10;
        }
        return count;
    }

}
