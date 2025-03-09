package Practice;

public class Methods {
    public static void main(String[] args) {
        int a = 45;
        Change(a);
//        System.out.println(a); // value remains the same
        // the java creates the copy of the variable provided to method
        // here provide variable is a = 45 the new copy is num = 45
        // so any changes performed on the "num" in the methods will not reflect on the variable "a"
        // but after the execution of Change() statement, the value of Change() become its return value -> here 100

        String name = "shreyash damodar";
        Change(name); 
//        System.out.println(name); // value ramains the same

        int num1 = 14;
        int num2 = 54;
        Swap(num1,num2);
        System.out.println(num1 +" "+ num2); // no swap occur
    }
    static int Change(int num){
        return num = 100;
    }

    static String Change(String input){
        return  input = "smartphone";
    }
    
    static void Swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a +" "+ b);
        // swap occur we are swapping a and b, but it is not reflected on num1 and num2
        // because a and b are the copies of num1 and num2
    }

    /* here the methods with the same name can exist due to the variation in the datatype
    of parameter and variation in number of parameter provided */
}
