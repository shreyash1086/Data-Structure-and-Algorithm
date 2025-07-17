package Learning.Basic;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        sum();
        String res = message("shreyash damodar");
        System.out.println(res);
        swap(10,20);
    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second number : ");
        int num2 = sc.nextInt();
        System.out.println(num1 + num2);
    }

    static String message(String name){
        String message = "Hello "+name;
        return message;
    }


/*    access modifier return type name(){

        body
        return;

}
*/
}
