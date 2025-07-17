package TUF.PracticeString;

import java.util.Stack;

public class RemoveOuterMostParanthesis {
    public static void main(String[] args) {
        String str = "(()())(())";
        System.out.println(Optimal(str));
    }

    static String Optimal2(String str){
        char[] ch = str.toCharArray();
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (char c: ch) {
            if(c == '('){
                if(count != 0){
                    sb.append(c);
                }
                count++;
            }else if(c == ')'){
                count--;
                if(count != 0){
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }

    //TIME COMPLEXIT IS O(N) AND SPACE COMPLEXITY IS O(1)
    static String Optimal(String str){
        int counter = 0;
        StringBuilder strn = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ')') counter--;
            if(counter != 0) strn.append(str.charAt(i));
            if(str.charAt(i) == '(') counter++;
        }
        return strn.toString();
    }

    //Time complexity is O(n) and space complexity is O(n)
    static String Remove(String str){
        Stack<String> stk = new Stack<>(); // space complexity is ~O(n/2) in average case and worst case is O(n)
        StringBuilder ans = new StringBuilder(); // space complexity is O(n)
        // the time complexity for the loop is O(n) but if we are adding result in ans = ans + "(" this way it can take O(n)
        // in java string concatination in the loop can take O(n^2) time
        // Hence we are using string builder
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '('){
                if(stk.empty()){
                    stk.push("(");
                }else {
                    stk.push("(");
                    ans.append("(");
                }
            }

            if(str.charAt(i) == ')'){
                stk.pop();
                if(!stk.empty()){
                    ans.append(")");
                }
            }
        }

        return ans.toString();// this method is used to convert the stringBuilder to string
    }
}
