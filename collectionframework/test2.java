package collectionframework;

import java.util.Iterator;
import java.util.PriorityQueue;

public class test2 {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("le phu cuong");
        queue.add("le phu cuong");
        queue.add("le phu cuong");
        System.out.println(queue.element());
        System.out.println(queue.peek());
        System.out.println("new ....");
        Iterator itr = queue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        queue.remove();
        queue.poll();
        System.out.println("after");
        Iterator<String> itr2 = queue.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }
    }
}
