package Learning.LearnCollections;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {
    public static void main(String[] args) {
        // Queue has two ends front and rear - it act as a ticket line in railway station
        // Queue is implemented using array and linkedList

        Queue<Integer> que = new LinkedList<>();

        que.offer(12);
        que.offer(23);
        que.offer(34);
        que.offer(45);
        que.offer(56);
        que.offer(67); // used to add elements in the queue

        System.out.println(que);

        System.out.println(que.peek());

        System.out.println(que.poll()); // used to delete the element at the front

        System.out.println(que);
    }
}
