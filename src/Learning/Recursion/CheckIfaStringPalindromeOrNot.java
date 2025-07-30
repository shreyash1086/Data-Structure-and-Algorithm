package Learning.Recursion;

public class CheckIfaStringPalindromeOrNot {
    public static void main(String[] args) {
        String str = "abcba";
        System.out.println(palindrom(str,0));
    }
    static boolean palin(String str,int l,int r){
        if(l>=r) return true;
        if(str.charAt(l) != str.charAt(r)){
            return false;
        }
        return palin(str,l+1,r-1);
    }
    static boolean palindrom(String str,int i){
        if(i >= str.length()/2){
            return true;
        }
        if(str.charAt(i) != str.charAt(str.length() - i - 1)){
            return false;
        }

        return palindrom(str,i+1);
    }
}
