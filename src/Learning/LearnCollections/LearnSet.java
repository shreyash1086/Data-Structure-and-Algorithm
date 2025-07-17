package Learning.LearnCollections;

import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
    public static void main(String[] args) {

//        Set<Integer> sc = new HashSet<>();
//        Set<Integer> sc = new LinkedHashSet<>(); // this will implement properties of Set as well as linked list
                                                    // means elements in this are one by one and order is maintained
          Set<Integer> sc = new TreeSet<>(); //Other properties are same but the output is sorted


        // This data structure does now allow duplicate elements

        sc.add(12);
        sc.add(56);
        sc.add(89);
        sc.add(56);
        sc.add(45);

        System.out.println(sc); // prints in random order and does not allow duplicate

        System.out.println(sc.size());

        sc.remove(45);

        System.out.println(sc);


    }
}
