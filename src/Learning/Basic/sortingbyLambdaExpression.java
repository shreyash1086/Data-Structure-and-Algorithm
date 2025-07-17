package Learning.Basic;

import java.util.*;

public class sortingbyLambdaExpression {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,2,3,4,5);
        Map<Integer,Integer> hm = new HashMap<>();
        hm.put(1,89);
        hm.put(2,98);
        hm.put(3,78);
        hm.put(4,85);
        hm.put(5,99);

//        li.sort((a,b) -> hm.get(a)-hm.get(b)); // a-b sort in ascending order means if a > b, a comes first
        li.sort((a,b) -> hm.get(b)-hm.get(a)); // b-a sort in decending order means if a < b, b comes first

//        If result > 0 → obj2 should come before obj1
//        If result < 0 → obj1 should come before obj2
//        If result == 0 → they are equal in sort order

        System.out.println(li);
    }
}
