package Learning.String_StringBuilder;

public class Alphabets {
    public static void main(String[] args) {
        String str ="";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            str += ch;
        }
        System.out.println(str);

        // Here it is everytime creating new String Object by appending previous string with the new ch.
        // which creates a complexity of n^2
        // It is not mutating the string as it is immutable

        // For the solution of this we use StringBuilder class which help use manipulate same string again and again
        // StringBuilder Allows Mutability


    }
}
