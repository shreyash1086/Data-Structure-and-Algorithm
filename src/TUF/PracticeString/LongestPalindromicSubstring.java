package TUF.PracticeString;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindromicSubstring {
    static int max = 0;
    static int start = 0;
    static int end = 0;
    public static void main(String[] args) {
        System.out.println(kaam("cbbd"));
    }

    //time complexity O(n^2) and space complexity O(1)
    static String optimal(String str){
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if(pal(str,i,j)){
                    if(j-i+1 > max){
                        max = j-i+1;
                        start=i;
                        end=j;
                    }
                }
            }
        }
        return str.substring(start,end+1);
    }
    static boolean pal(String str,int i,int j){
        while(i<=j){
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(j);
            if(ch1 != ch2){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    //second approach - without using hash map
    //time complexity is O(n^2) but space complexity is O(1)
    static String kaam(String str){
        int length = 0;
        StringBuilder sbn = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                boolean temp = palindrome(str.substring(i,j+1));
//                length = Math.max(length,j-i+1);
                if(temp && length < j-i+1){
                    length = j-i+1;
                    sbn.setLength(0);
                    sbn.append(str.substring(i,j+1));
                }
            }
        }
        return sbn.toString();
    }

    //This is a feasible solution but the fact is that it not optimal for large size strings as it will generate numerous numbers of subtring which can increse the space complexity
    //time comp - O(n^2) and space - O(n^2) that is worst of em all
    static String palindromeLong(String str){
        int count = 1;
        Map<Integer,String> mp = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                String temp = str.substring(i,j+1);
                mp.put(count,temp);
                count++;
            }
        }
        int length = 0;
        int index = 0;
        for (int i = count-1;i >=1; i--) {
            String str2 = mp.get(i);
            if(palindrome(str2)){
//                length = Math.max(length,str2.length());
                if (str2.length()>length){
                    length = str2.length();
                    index = i;
                }
            }
        }

        return mp.get(index);
    }

    static boolean palindrome(String str){
        StringBuilder str1 = new StringBuilder();
        for (int i = str.length()-1; i >= 0; i--) {
            str1.append(str.charAt(i));
        }
        return str.contentEquals(str1);
    }


}
