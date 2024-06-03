import java.util.*;

public class PriQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(4);
        pq.add(1);
        pq.add(5);

        System.out.println(pq);  //implemented according to minheap

        System.out.println(pq.peek());

        PriorityQueue<String> n = new PriorityQueue<>();
        n.offer("Neha");
        n.offer("Herself");
        n.offer("Loves");

        System.out.println(n);

        PriorityQueue<String> n1 = new PriorityQueue<>();
        n1.add("Neha");
        n1.add("Herself");
        n1.add("Loves");

        System.out.println(n1);
    }
}

/*
 A PriorityQueue is used when the objects are supposed to be processed based on the priority. 
 It is known that a Queue follows the First-In-First-Out algorithm, but sometimes the elements of the queue are needed to be processed according to the priority, that’s when the PriorityQueue comes into play.
 The PriorityQueue is based on the priority heap.

 To declare pq: 
 PriorityQueue<E> pq = new PriorityQueue<E>();
 */