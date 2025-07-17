package Learning.Basic;

public class ProblemsSet1 {
    public static void main(String[] args) {
        isPrime(7);
        boolean ans = isArm(371);
        System.out.println(ans);
        for (int i = 100; i < 1000; i++) {
            if(isArmstrong(i)){
                System.out.print(i+" ");
            }
        }
    }
    static void isPrime(int n){
        int i = 2;
        while(n > i){
            if(n%i == 0){
                System.out.println(n+" Not a prime number");
                return;
            }
            i++;
        }
        System.out.println(n +" is a prime number");
    }

    static boolean isArmstrong(int n){
        int check = n;
        int length = 0;
        int temp = n;
        int number;
        int newNum = 0;
        while(temp != 0){
            length++;
            temp = temp/10;
        }

        for (int i = 0; i < length; i++) {
            int temp2 = 1;
            number = check % 10;
            for (int j = 0; j < length; j++) {
                 temp2 = temp2 * number;
            }
            newNum +=temp2;
            check = check/10;
        }

        if (n == newNum) {
            return true;
        }
        return false;
    }

    static boolean isArm(int n){
        int number = n;
        String value = Integer.toString(n);
        int sum = 0;
        while(number > 0){
            int rem = number % 10;
            sum = sum + (int) Math.pow(rem,value.length());
            number = number / 10;
        }
        if(sum != n){
            return false;
        }
        return true;
    }
}
