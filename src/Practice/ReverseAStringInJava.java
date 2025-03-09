package Practice;

import java.util.Scanner;

public class ReverseAStringInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        int temp = 1;
        char[] str_arr = str.toCharArray();
        char[] str2 = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            str2[i] = str_arr[str.length() - temp];
            temp++; //here when "i" becomes 4 loop will only run once but same time when "i" increments to 4 the temp become five so last loop will give index of 0
        }
        String result = "";
        for (int j = 0; j < str.length(); j++) {
            result = result + str2[j]; //adding the values of the char array to a string variable one by one
        }
        System.out.println(result);
    }
}
