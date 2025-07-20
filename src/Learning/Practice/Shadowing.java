package Learning.Practice;

public class Shadowing {
    static int a = 10;
    public static void main(String[] args) {
        System.out.println(a);
        Change(a);
        System.out.println(a);
    }
    static int Change(int num){
        int a = 45;
        System.out.println(a);
        return a;
    }
}
