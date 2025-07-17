package TUF.PracticeString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SortCharactersbyfrequency {
    public static void main(String[] args) {
        String s = "tree";
        System.out.println(chhar(s));
    }

    //time - O(N+MlogM) and space - O(N+M)

    static String chhar(String s){
        StringBuilder ans = new StringBuilder();//spaceC - O(N)
        HashMap<Character,Integer> hm = new HashMap<>();//spaceC - O(M)
        for(char ch: s.toCharArray()){ //timeC - O(N)
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        List<Character> list = new ArrayList<>(hm.keySet());// spaceC - O(M) and time O(M)
        // sort the list element based on the frequency stored in the hashmap
        list.sort((obj1,obj2) -> hm.get(obj2) - hm.get(obj1)); //TimeC -O(MlogM)
        for(char ch: list){ //O(N) - each character appear hm.get() times - total across all is N
            for (int i = 0; i < hm.get(ch); i++) {
                ans.append(ch); //O(N) space
            }
        }
        return ans.toString();
    }
}
