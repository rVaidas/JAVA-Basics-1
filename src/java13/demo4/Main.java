package java13.demo4;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        testQueue(new PriorityQueue<>());

    }

    private static void testQueue(Queue<Integer> queue) {
        queue.add(20);
        queue.add(30);
        queue.add(20);

        queue.add(50);
        queue.add(20);
        queue.add(10);

        System.out.print("Eilė:");
        for (Integer i : queue) {
            System.out.print(" " + i);
        }
        System.out.println();

        System.out.println("Ar yra 20? = " + queue.contains(20));

        System.out.println("Išmetam is sąrašo paskutinį, t.y. 10");
        queue.poll();
        queue.peek();
        System.out.print("Eilė:");
        for (Integer i : queue) {
            System.out.print(" " + i);
        }
        System.out.println();
        Iterator iterator = queue.iterator();
    }
}
