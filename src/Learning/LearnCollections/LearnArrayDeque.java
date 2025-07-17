package Learning.LearnCollections;

import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        // it is a doubly queue which is used to add and remove the element form both the ends front and rear

        adq.offer(12);
        adq.offerFirst(34);
        adq.offerLast(45);
        adq.offer(78);
        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());
        System.out.println(adq.pollFirst());
        System.out.println(adq.pollLast());
        System.out.println(adq);
    }
}
