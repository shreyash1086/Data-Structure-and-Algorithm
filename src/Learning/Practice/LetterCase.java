package Learning.Practice;

import java.util.Scanner;

public class LetterCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter character : ");
        char x = in.next().trim().charAt(0);
        if(x>='a' && x<='z'){
            System.out.println("LowerCase");
        }else if(x>='A' && x<='Z') {
            System.out.println("UpperCase");
        }else {
            System.out.println("Special Character");
        }
//        int num = x;
//        System.out.println(num);
    }
}
