package Learning.Basic;

public class Operator {
    public static void main(String[] args) {
        //arithmetic operator
        int a = 10;
        int b = 5;
        boolean cond = true;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        //Unary operator

        //Unary minus (-)

        System.out.println(-a);

        //Not operator (!) - convert true to false and false to true

        System.out.println(!cond);

        //increment and decrement

        System.out.println(a++ +" "+ a);// first print 10 then perform incrementation - post increment
        System.out.println(++a);//first perform incrementation then print
        System.out.println(--a);
        System.out.println(a--+" "+a);

        //bitwise complement(~)

        int c = 6; // 5 = 0101 then ~5 = 1010 then 2's complement of this number 0101 + 1 that is 0110 initial digit is 0 means negative value hence negative -6
        System.out.println(~c);


        // assignment operator

        //called as composite operator
        int num = 20;

        System.out.println(num += 10); // add 10 with the num and then print
        System.out.println(num-=10);//sub 10 from num then print
        System.out.println(num*=2);//multiply num with 2 and then print
        System.out.println(num/=2);//divide num by 2 and then print
        System.out.println(num%=2);//remainder is assigned to the num after dividing by 2

        //relational operator - used to check relation between two operator

        int num1 = 10;
        int num2 = 20;

        System.out.println(num1>num2);
        System.out.println(num1<num2);
        System.out.println(num1<=num2);
        System.out.println(num1>=num2);
        System.out.println(num1==num2);
        System.out.println(num1!=num2);

        //Logical operator - AND(&&), OR(||)and NOT(!)


        // we can you logical operator with the boolean values
        int a1 = 1, a2 = 2, a3 = 3;
        System.out.println(a1 > a2 && a2 < a3);//If both the conditions are true then true else false
        System.out.println(a1 < a2 || a2 > a3);// if even one condition is true then answer is true
        System.out.println(!(a1 < a2));// converts the false statement to true and true to false


        //ternary operator in java - similar to the if else but in optimal form

        int k1 = 10;
        int k2 = 20;

        // if the condition of the first statement is executed successfully then the expression after ? will be executed else expression after the : will be executed
        int res = (k1 > k2)?(k1+k2):(k1-k2);
        System.out.println(res);
    }
}
