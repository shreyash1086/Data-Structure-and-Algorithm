package Practice;

import java.util.Scanner;

public class JavaProgramVowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character to check whether it is a vowel or consonant : ");
        char x = sc.next().trim().toLowerCase().charAt(0);
        if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u'){
            System.out.println("its an vowel");
        }else {
            System.out.println("Its an consonant");
        }
    }
}
