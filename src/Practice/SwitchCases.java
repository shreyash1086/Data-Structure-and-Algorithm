package Practice;

import java.util.Scanner;

public class SwitchCases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String fruit = sc.next();
        //switch-case
//        switch (fruit){
//            case "mango":
//                System.out.println("King of fruit");
//                break;
//            case "apple":
//                System.out.println("a apple a day keep doctor away");
//                break;
//            case "orange":
//                System.out.println("Sweet and Sour");
//                break;
//            default:
//                System.out.println("Not a fruit");
//        }
        //enhanced Switch
//        switch (fruit) {
//            case "mango" -> System.out.println("King of fruit");
//            case "apple" -> System.out.println("a apple a day keep doctor away");
//            case "orange" -> System.out.println("Sweet and Sour");
//            case "grapes" -> System.out.println("multiple grapes");
//            default -> System.out.println("Please enter a valid fruit");
//        }

        int day = sc.nextInt();

       switch (day){
           case 1 -> System.out.println("Monday");
           case 2 -> System.out.println("Tuesday");
           case 3 -> System.out.println("Wednesday");
           case 4 -> System.out.println("Thursday");
           case 5 -> System.out.println("Friday");
           case 6 -> System.out.println("Saturday");
           case 7 -> System.out.println("sunday");

           default -> System.out.println("Not a valid day");
       }

    }
}
