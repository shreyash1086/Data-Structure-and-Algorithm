package Practice;

import java.util.Scanner;

public class Inputanumberandprintallthefactorsofthatnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number Whose factors to be searched : ");
        int num = sc.nextInt();
        int factor = 1;

        while (factor <= num){
            if(num %  factor == 0){
                System.out.println(factor);
                factor++;
            }else{
                factor++;
            }
        }
    }
}
