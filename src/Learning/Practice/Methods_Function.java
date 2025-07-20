package Learning.Practice;

import java.util.Scanner;

public class Methods_Function {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

/*
        name() - calling a method inside this methods
        Sum();
        int result = Mul();
        System.out.println("The multiplication is "+result);
*/
        System.out.println("enter number : ");
        int num1 = sc.nextInt();
        System.out.println("enter number : ");
        int num2 = sc.nextInt();
        int DivRes = Div(num1,num2);
        System.out.println("The division is "+DivRes);
    }

/*
    access-modifier return-type name(){
        //body
        return statement // the return type and return statement should have same data type
    }
   creating a method
*/

    static void Sum(){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the 1st number  :");
        int num1 = sc.nextInt();
        System.out.println("Enter the 2nd number  :");
        int num2 = sc.nextInt();
        int Sum = num1 + num2;
        System.out.println("The Sum is "+Sum);
    }

//    creating a method with a return type

    static int Mul(){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the 1st number  :");
        int num1 = sc.nextInt();
        System.out.println("Enter the 2nd number  :");
        int num2 = sc.nextInt();
        int Mul = num1 * num2;
        return Mul;
    }

//    creating a method with parameters

    static int Div(int a,int b){ // the values passed in the braces are the parameter which get values when the function is called using the argument. the values provided in the argument are then transfer to the parameters for the further operation
        int Div = a/b; // if you provide the 12 and 9 as an input the result will generate like 1.3333 which is a double but return type of the Div is int here to solve the Problem AUTOMATIC TYPECASTING WILL TAKES PLACE here the double is typecast to integer and the result of operation will be 1 as generated result is 1.33333
        return Div;
    }
}
