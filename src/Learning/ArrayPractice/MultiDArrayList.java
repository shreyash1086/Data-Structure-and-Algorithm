package Learning.ArrayPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<String>> list2D = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            list2D.add(new ArrayList<>());
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list2D.get(i).add(sc.next());
            }
        }
            System.out.println(list2D);

    }
}
