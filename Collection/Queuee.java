package DSA.Collection;

import java.util.*;

public class Queuee {
    public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();
    /*
    //to add elements at rear side. || T.C - O(1)
    add(element): If the queue is full, it throws an exception.
    offer(element): If the queue is full, it returns false.
    */
    q.add(5);
    q.add(7);
    q.offer(45);
    q.offer(78);
    System.out.println(q);

    /*
    //to remove element wrt to FIFO. || T.C - O(1)
    remove():If the queue is empty, it throws an exception.
    poll(): If the queue is empty, it returns null.
     */
    q.poll();
    System.out.println(q);

    //it tell us about the next element to be pop || T.C - O(1)
    System.out.println(q.peek());

    //It is better to use poll, offer and peek instead of there alternatives.
    }
}

/*
 The Queue interface is present in java.util package and extends the Collection interface is used to hold the elements about to be processed in FIFO(First In First Out) order. 
 It is an ordered list of objects with its use limited to inserting elements at the end of the list and deleting elements from the start of the list, (i.e.), it follows the FIFO or the First-In-First-Out principle.
 */