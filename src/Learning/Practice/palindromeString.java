package Learning.Practice;

public class palindromeString {
    public static void main(String[] args) {
        String str = "12321";
        if(ispalindrome(str)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
    static boolean ispalindrome(String str){
        int left = 0;
        int right = str.length()-1;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
