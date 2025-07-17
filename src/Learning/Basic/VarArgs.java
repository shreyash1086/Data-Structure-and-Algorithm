package Learning.Basic;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1,2,3,2,1,2,3,2,1,5,5,1,2,6);
    }

    static void fun(int ...v){ // it takes input as an array it can be of any data type and of any length
        System.out.println(Arrays.toString(v));
    }
}
