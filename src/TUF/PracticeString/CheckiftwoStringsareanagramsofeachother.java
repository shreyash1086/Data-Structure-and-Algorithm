package TUF.PracticeString;

import java.util.Arrays;

public class CheckiftwoStringsareanagramsofeachother {
    public static void main(String[] args) {
        String a = "cat";
        String b = "act";
        System.out.println(chack2(a,b));
    }

    //Appoach 2
    //time complexity is O(n) for two for loop and space complexity is O(1) - as alp is fixed sized array
    static boolean chack2(String a,String b){
        if(a.length() != b.length()) return false;

        int[] alp = new int[26];

        for(char ch:a.toCharArray()){
            alp[ch-'a']++;
        }

        for(char ch:b.toCharArray()){
            alp[ch-'a']--;
        }

        for (int i = 0; i < alp.length; i++) {
            if(alp[i] != 0) return false;
        }
        return true;
    }

    //Approach 1
    //time complexity is O(n) ans space complexity is O(n+n) ~ O(n)

    static boolean check(String a,String b){

        if(a.length() != b.length()){
            return false;
        }

        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(b1);

        for (int i = 0; i < a1.length; i++) {
            if(a1[i] != b1[i]) return false;
        }

        return true;
    }
}
