package LeetCode;
//https://leetcode.com/problems/find-first-palindromic-string-in-the-array/
public class firstPalindromeelement {
    public static void main(String[] args) {
        String temp = "";
        String st = "shreuash";
        char[] chararr = st.toCharArray();
        for(int i=chararr.length-1;i>=0;i--){
            temp = temp + chararr[i];
        }
        System.out.println(temp);
        System.out.println(st);
        if(st.equals(temp)){

        }
    }
}
