package june23;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Random;

public class PriorityQueueExample {

    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        queue.add("bart");
        queue.add("lisa");
        queue.add("homer");
        queue.add("marge");
        queue.add("meg");

        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        PriorityQueue<Integer> maxheap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        maxheap.add(1);
        maxheap.add(7);
        maxheap.add(100);

        System.out.println(maxheap.poll());

        Random random = new Random();
        System.out.println(random.nextInt(20));
        System.out.println(random.nextInt(20));
        System.out.println(random.nextInt(20));

    }
}
