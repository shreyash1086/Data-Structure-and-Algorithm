package Learning.String_StringBuilder;

public class Palindrome {
    public static void main(String[] args) {
        String str = "abcba";
//        boolean bool = PalindromeMethod(str);
//        System.out.println(bool);
//        boolean sol = PalindromeTwoPointerMethod(str);
        boolean sol = Pal(str);
        System.out.println(sol);
    }
    static boolean PalindromeMethod(String str){
        String strCp = "";

        for (int i = str.length()-1; i >= 0; i--) {
            strCp = strCp + str.charAt(i);
        }

        if(str.equals(strCp)){
            return true;
        }
        return false;
    }

    static boolean PalindromeTwoPointerMethod(String str){

        //edge case

        if(str == null || str.length() == 0){
            return true;
        }

        int start = 0;
        int end = str.length()-1;

        while(start <= end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    static boolean Pal(String str){

        if(str == null || str.length() == 0){
            return true;
        }

        for(int i = 0; i <= str.length()/2; i++){
            int start = str.charAt(i);
            int end = str.charAt(str.length() - 1 - i);

            if(start != end){
                return false;
            }
        }
        return true;
    }
}
