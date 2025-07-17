package Learning.LearnCollections;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {
    // map is used to store the key-value pair

    public static void main(String[] args) {
        Map<String,Integer> numbers = new HashMap<>();

        numbers.put("One",1);
        numbers.put("Two",2);
        numbers.put("Three",3);

        numbers.put("Two",22);// this overrides the value

        numbers.putIfAbsent("Three",33); // it check if key named Three is present if yes then it wont add the new entry - value override nahi hogi

        System.out.println(numbers);
    }
}
