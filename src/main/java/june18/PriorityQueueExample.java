package june18;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(2342);
        pq.add(23233);
        pq.add(232);
        pq.add(32);
        pq.add(23423432);

        //System.out.println( pq.peek() );

        // can you sort with priority queue
        // heapsort
        while(!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
