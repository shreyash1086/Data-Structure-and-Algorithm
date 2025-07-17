package TUF.PracticeString;

import java.util.Arrays;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "Shreyash is Shreyash";
        System.out.println(Check(str));
    }
    static boolean Check(String str){
        StringBuilder sb = new StringBuilder();

        String[] strA = str.trim().split("//s+");
        for (int i = strA.length-1; i>= 0; i--){
            sb.append(strA[i]);
            if(i != 0){
                sb.append(" ");
            }
        }
        if(str.contentEquals(sb)){
            return true;
        }
        return false;
    }
}
