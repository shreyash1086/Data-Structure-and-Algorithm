package Learning.ArrayPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTut {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(12);
        arr.add(23);
        arr.add(24);
        arr.add(2,34);
        System.out.println(arr);
//        System.out.println(arr.contains(24));
        arr.remove(2);  
        System.out.println(arr);
//        for (int i = 0; i < 4; i++) {
//            arr.add(sc.next());
//        }
//
//        for (int i = 0; i < 4; i++) {
//            System.out.print(arr.get(i)+" ");
//        }

    }
}
