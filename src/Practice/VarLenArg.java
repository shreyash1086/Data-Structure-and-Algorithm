package Practice;

import java.util.Arrays;

public class VarLenArg {
    public static void main(String[] args) {
        fun(1,2,4,5,4,5,6,4,7,8,7,8,9);
        fun("shreyash","damodar","from","Akola","Student","SSGMCE","Shegaon");
    }
    static void fun(int ...num){
        System.out.println(Arrays.toString(num));
    }

    static void fun(String ...str){
        System.out.println(Arrays.toString(str));
    }
}
