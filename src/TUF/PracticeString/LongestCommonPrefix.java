package TUF.PracticeString;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(Optimized(strs));
    }

    //Optimizing Optimal
    //time complexity is O(nlogn)
    //space complexity is o(1)
    static String Optimized(String[] strs){
        Arrays.sort(strs);
        String str1 = strs[0]; //space O(1)
        String str2 = strs[strs.length-1];//space O(1)
        int index = 0;
        while(index < str1.length()){
            if(str1.charAt(index) == str2.charAt(index)){
                index++;
            }else{
                break;
            }
        }
        return index == 0?"":str1.substring(0,index); //space O(1)
    }

    //time complexity is O(nlogn) + O(m^2)
    //but space complexity is O(m)
    static String Optimal(String[] strs){
        Arrays.sort(strs); // time complexity is O(nlogn)
        String ans = "";
        char[] first = strs[0].toCharArray(); //O(m) space creation
        char[] last = strs[strs.length-1].toCharArray();//O(m) space creation

        for (int i = 0; i < first.length; i++) { //time complexity O(m^2) due to repeated string concatenation
            if(first[i] == last[i]){
                ans = ans + first[i];
            }else{
                return ans;
            }
        }
        return ans;
    }
}
