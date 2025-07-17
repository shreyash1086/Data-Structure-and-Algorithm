package Learning.ArrayPractice;

import javax.xml.parsers.SAXParser;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<Integer> arrlist = new ArrayList<>();
        arrlist.add(1);
        arrlist.add(3);
        arrlist.add(4);
        arrlist.add(7);
        arrlist.add(8);
        arrlist.add(13);

        System.out.println(arrlist);

        int[] arr = new int[arrlist.size()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arrlist.get(i);
        }

        System.out.println(Arrays.toString(arr));

    }
}
