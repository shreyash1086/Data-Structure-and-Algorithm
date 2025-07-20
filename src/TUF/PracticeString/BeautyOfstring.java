package TUF.PracticeString;

import java.util.HashMap;
import java.util.Map;

public class BeautyOfstring {
    //this solution solves the problem for the beauty if string and sum of beauty of all sub string;
    public static void main(String[] args) {
        int res = 0;
        String sb = "tfpizfxhzaxwhdqkbpaxoozjzkswsvebbfvfpffvozjqwjxlukoenqlhisoqxhcuvxcwjnziuigzxzcfuaigcmcqolotcnsdozmpndnuwvxjvvnnnmjprgnjjzszqynffxwmjpeampodrxweoejtznpbllrnvjjdlyxrgsnzaodrzlieumealaegksejxlxhrwjwovwekgyopbrwjnwtxpdedqyuwjnnadejtvsodwkhciwdyxbyjcarxxecyzigyfylfezfiewysfeybvqifqiwasuybxsfccavioffieosofisywofdwktafemsvmxdqwxjcbinzsjgshptrsiqqyjdqkjbyuap";
        for (int i = 0; i < sb.length(); i++) {
            for (int j = i; j < sb.length(); j++) {
                String st = sb.substring(i,j+1);
                res = res + solve(st,i,j+1);
            }
        }
        System.out.println(res);
    }
    static int solve(String str,int a,int b){
        if(str.isEmpty()){
            return 0;
        }

        int highest = 0;
        int lowest = Integer.MAX_VALUE;
        Map<Character,Integer> pm= new HashMap<>();
        for(char ch: str.toCharArray()){
            pm.put(ch,pm.getOrDefault(ch,0)+1);
        }

//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            highest = Math.max(highest,pm.get(ch));
//            lowest = Math.min(lowest,pm.get(ch));
//        }

        for (int i: pm.values()) {
            highest = Math.max(highest,i);
            lowest = Math.min(lowest,i);
        }

        pm.clear();
        return highest-lowest;
    }
}
