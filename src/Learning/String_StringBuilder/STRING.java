package Learning.String_StringBuilder;

import java.util.ArrayList;
import java.util.Arrays;

public class STRING {
    public static void main(String[] args) {

//        String is a class - a class in java has the first word capital

//      data type reference variable  = object of string
        String name = "Shreyash"; // collection of characters

//        Every string created is an object of type String

        String[] str = {"shreyash","damodar"};
        // str is a reference variable and it is stack memory and the assigned value is an object which is present in heap memory

        System.out.println(Arrays.toString(str));

//        reference variable is stored in stack and object is stored in the heap

//        String Pool - It is a separate memory structure inside the heap.
//                      All the same values of a string are not created again and again in heap

        // say if we have two variables names a and b having the same value "shreyash"
        // the heap memory will not generate two different "shreyash" object in the heap
        // Only one "shreyash" object is created and the two variables a and b will point to the same value in the heap


        // when we simply declare a String variable and assign value to it a object of string is created in heap.
        // if we compare the two String variables having the same string value by using == operator it will print "True".
        // as both variables are pointing to the same object of the heap memory


        // If we want to create two different variable having same Object of type String we can use new key word
        // example String str1 = new String("Shreyash");
        //         String str2 = new String("Shreyash");

        // and if we now compare the two str1 and str2 with the help of == operator it will throw "False"
        // Hence to properly compare the two string we use (str1.equals(str2)) method.

        String str1 = new String("shreyash");
        String str2 = new String("shreyash");

        System.out.println(str1 == str2); // false
        System.out.println(str1.equals(str2));// true

        System.out.println('a'+'b'); // characters are converted into Unicode value and then perform numeric addition
        System.out.println("a"+"b"); // Here String will get concatenated

        System.out.println('a'+3); // it will give the uncode value to the 'a' that is 97 and add 3 with it.

        System.out.println((char)('a'+3)); // now it will print the character which has Unicode value 100 that is 'd'

        System.out.println("shreyash"+1); // string in addition with the integer it is converted to its wrapper class call toString
        // the integer value in addition with the string will get converted into the string

        System.out.println("shreyash"+ new ArrayList<>()); // this will create a new arraylist and as it is empty it will concatenate the arraylist with the string.

        // Concatenation can only used with primitives and you can only use this with all the complex object as well but only one condition, at least one of these object should be type string
        // System.out.println(56+new ArrayList<>()); will throw error

        System.out.println(56+""+new ArrayList<>());

//        the "+" addition operator is providing us with more functionalities such as concatenation hence it is called as the operator overloading
    }
}
