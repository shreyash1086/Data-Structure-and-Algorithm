package TUF.PracticeString;

import java.util.Stack;

public class MaximumNestingDepthoftheParentheses {
    public static void main(String[] args) {

    }
    static int MaxDepth(String str){
//        Stack<Character> st = new Stack<>();
        int depth = 0;
        int Max = 0;
        for(char ch: str.toCharArray()){
            if(ch == '('){
                depth++;
                Max = Math.max(Max,depth);
            } else if (ch ==')') {
                depth--;
            }
        }
        return Max;
    }
}
