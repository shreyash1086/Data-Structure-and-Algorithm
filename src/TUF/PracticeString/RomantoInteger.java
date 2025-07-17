package TUF.PracticeString;

import java.util.HashMap;
import java.util.Map;

public class RomantoInteger {
    public static void main(String[] args) {
        System.out.println(Number("LVIII"));
    }
    static int Number(String s){
        int Sum = 0;
        Map<Character,Integer> mp = new HashMap<>();
        mp.put('I',1);
        mp.put('V',5);
        mp.put('X',10);
        mp.put('L',50);
        mp.put('C',100);
        mp.put('D',500);
        mp.put('M',1000);

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            char ch2 = 0;
            int j = i+1;
            if(i != s.length()-1){
                ch2 = s.charAt(j);
            }
            if(i != s.length()-1 && mp.get(ch) < mp.get(ch2)){
                Sum = Sum + mp.get(ch2) - mp.get(ch);
                i = i + 1;
            }else{
                Sum = Sum + mp.get(ch);
            }
        }

        return Sum;
    }
}
