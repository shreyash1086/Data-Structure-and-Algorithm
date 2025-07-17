package TUF.PracticeString;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "badc";
        String t = "baba";
        System.out.println(isIsomorphic(s,t));
    }
    static boolean isIsomorphic(String s,String t){
        Map<Character,Character> mp = new HashMap<>();
        Set<Character> st = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if(mp.containsKey(c1)){
                if(mp.get(c1) != c2) return false; //Check if characters are unequal to avoid conflict
            }else{
                if (st.contains(c2)) return false; //Check if st already contains he mapped values if yes dont add again
                mp.put(c1,c2);
                st.add(c2);
            }
        }
        return true;
    }
}
