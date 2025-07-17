package Learning.LearnHashMap;

import java.util.HashMap;

public class LearnHashMap {
    public static void main(String[] args) {
        // Map is a set of key value pair
        HashMap<String,Integer> empIds = new HashMap<>(); // the Keys are going to be String and the values are going to be Integer

        empIds.put("shreyash",1086);
        empIds.put("nishant",121212);
        empIds.put("mangesh",78789);
        // doesn't guarantee a certain order
        System.out.println(empIds);

        System.out.println(empIds.get("mangesh"));

        System.out.println(empIds.containsKey("shreyas"));

        System.out.println(empIds.containsValue(1086));

        //Overrides the shreyash keys value
        empIds.put("shreyash",3607);
        System.out.println(empIds);

        empIds.putIfAbsent("kama",8978456);
        System.out.println(empIds);

        empIds.remove("shreyash");
        System.out.println(empIds);
    }
}
