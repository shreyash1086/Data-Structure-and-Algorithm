package Learning.Practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetHashSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        //A hash set has no particular order

        //adding to the set
        names.add("shreyash");
        names.add("namaika");
        names.add("shreyashdamodar");
        names.add("hash");
        names.add("pratik");
        names.add("hash");

        System.out.println(names);


        //Sets by design do not allow duplicates

        //removing from the set

        names.remove("hash");

        //Printing size of the set

        System.out.println(names.size());

        //check whether the set contains a provided object or not if yes then return true else false

        System.out.println(names.contains("pratik"));

        //check wheather set is empty

        System.out.println(names.isEmpty()); // false means its not empty

        //clear set at one

//        names.clear();
//
//        System.out.println(names);

        // Lambda printing values of the set

//        names.forEach(System.out::println);

        //Iterator Implementation to iterate over set

        Iterator<String> namesIterator = names.iterator();

        while (namesIterator.hasNext()){
            System.out.println(namesIterator.next());
        }

    }
}
