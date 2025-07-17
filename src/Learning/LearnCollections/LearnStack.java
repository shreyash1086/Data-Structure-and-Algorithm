package Learning.LearnCollections;

import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        // stack follows property of first in last out OR last in first out

        // Consider the stack of dining plates

        Stack<Integer> st = new Stack<>();

        st.push(45);
        st.push(23);
        st.push(25);
        st.push(78);
        System.out.println(st);

        System.out.println(st.peek()); // this will print the top element in the stack

        st.pop();// This will remove the top element in the stack

        System.out.println(st);
    }
}
