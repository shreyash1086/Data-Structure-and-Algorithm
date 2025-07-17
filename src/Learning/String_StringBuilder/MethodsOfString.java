package Learning.String_StringBuilder;

import java.util.Arrays;

public class MethodsOfString {
    public static void main(String[] args) {

        // After applying the methods to the name variable the variable itself will not be changed as string is immutable but new string object will be generated
        String name = "shreyash";
        System.out.println(Arrays.toString(name.toCharArray()));
        // it first converts the string into the character array using ".toCharArray()" method and then that array is converted into string using "Arrays.toString()" method

        System.out.println(name.toUpperCase());
    }
}
