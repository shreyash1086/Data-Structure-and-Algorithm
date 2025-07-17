package Learning.Basic;

public class ExceptionHandling {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            System.out.println(a/b);
        } catch (Exception e) {
            System.out.println("Buddy cannot divide an Integer by Zero");
        } finally { // it will execute everytime whether there is exception(catch block) or not(try block).
            System.out.println("I am Happy");
        }

        System.out.println(Exception());
    }

    static int Exception(){
        try{
            return 9; // this will surely execute but this return statement will be overwritten by the return statement in the finally block as it is made to execute everytime whether there is a exception or not
        }catch (Exception e){
            return 5;
        }finally {
            return 3;
        }
    }
}
