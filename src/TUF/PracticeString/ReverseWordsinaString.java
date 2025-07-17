package TUF.PracticeString;

import java.util.Stack;

public class ReverseWordsinaString {
    public static void main(String[] args) {
        String s="  hello world  ";
        System.out.println(reverseOpt(s));
    }

    //Better time complexity solution
    static String betterTime(String str){
        StringBuilder res = new StringBuilder();
        String[] strArr = str.trim().split("\\s+");
        for (int i = strArr.length-1; i >= 0 ; i--) {
            res.append(strArr[i]);
            if(i != 0) res.append(" "); // this mean if i is the last element we dont add space after last element;
        }
        return res.toString();
    }


    //time complexity is O(n) and space complexity is O(1)
    static String reverseOpt(String str){
        String temp = "";
        String ans = "";
        int left = 0;
        int right = str.length()-1;

        while(left <= right){
            char ch = str.charAt(left);
            if(ch != ' '){
                temp += ch;
            }else if (ch == ' '){
                if(!ans.isEmpty()){//If ans is empty then directly add temp to word else first add temp then blank space and then the ans
                    if (!temp.isEmpty()){ //if ans is not empty thats fine but if temp is empty no need to add we are just adding useless blank space hence the if statement is here
                        ans = temp+" "+ans;
                    }
                }else {
                    ans = temp;
                }
                temp="";
            }
            left++;
        }

        if(!temp.isEmpty()){ //This block adds the last word to the ans
            if(!ans.isEmpty()){
                ans = temp +" "+ans;
            }else{
                ans = temp;
            }
        }
        return ans;
    }

    static String reverse(String str){
        str += " ";
        Stack<String> st = new Stack<>();
        String sb = "";

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' '){
                if(!sb.isEmpty()){
                    st.push(sb);
                }
                sb ="";
            }else{
                sb += str.charAt(i);
            }
        }
        System.out.println(st);
        StringBuilder ans = new StringBuilder();

        while(st.size() != 1){
            ans.append(st.peek());
            ans.append(' ');
            st.pop();
        }

        ans.append(st.peek());

        return ans.toString();
    }
}
