package Learning.LearnCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(12);
        list.add(45);
        list.add(23);
        list.add(77);
        list.add(98);

        System.out.println(list);
//        list.clear(); // clears the list
        System.out.println(list.get(1));
        System.out.println(list.indexOf(23));
        System.out.println(list.getLast());
        list.removeFirst();
        list.remove(Integer.valueOf(77));
        list.add(1,97);
        System.out.println(list);

        List<Integer> newLt = new ArrayList<>();
        newLt.add(45);
        newLt.add(88);
        System.out.println(newLt);
        newLt.addAll(list);
        System.out.println(newLt);

        //Iterating Over a List

        for (int i = 0; i < newLt.size(); i++) {
            System.out.println("Here is the element : "+newLt.get(i));
        }
        System.out.println();

        //Using enhanced for loop
        for(int x: newLt){
            System.out.println("Here is the element : "+x);
        }

        //Using Iterator

        Iterator<Integer> it = newLt.iterator();

        while(it.hasNext()){ // check if array list has a next element
            System.out.println("Iterator"+it.next()); // print the next value in the list
        }

    }
}
