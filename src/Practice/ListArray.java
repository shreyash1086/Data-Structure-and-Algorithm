package Practice;
import java.util.ArrayList;
import java.util.Scanner;

public class ListArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        //input item
        for (int i = 0; i < 10; i++) {
            list.add(sc.nextInt());
        }

        //get item
        for (int i = 0; i < 10; i++) {
            System.out.println(list.get(i)); //list[index] syntax will not work here
        }
    }
}
