package Learning.LearnCollections;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(/*comparator*/ Comparator.reverseOrder()); // this comparator convert the min heap to max heap

        pq.offer(57);
        pq.offer(12);
        pq.offer(11);
        pq.offer(7);
        pq.offer(34);

        System.out.println(pq); // [7, 11, 12, 57, 34] - under the hood a min heap data structure is implemented
                                // sabse chota wala element sabse top par hota hai
        pq.poll();

        System.out.println(pq); // see here its uses the same concept too.

    }
}
