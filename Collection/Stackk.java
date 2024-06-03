import java.util.*;

public class Stackk {
    public static void main(String[] args) {
        /* 
        //for different objects
        Stack<Object> n = new Stack<>();
        n.push("Neha");
        n.push(3);
        */
        
        Stack<Integer> s = new Stack<>();
        s.push(4);
        s.push(5);
        s.push(6);
        
        System.out.println(s);

        //It gives us top element || T.C - O(1)
        System.out.println(s.peek());

        //pop the element according to LIFO || T.C - O(1)
        s.pop();
        System.out.println(s);

        //It searches from top and it is 1-based indexing || T.C - O(n)
        System.out.println(s.search(5));
    }
}

/*
  Java Collection framework provides a Stack class that models and implements a Stack data structure.
  The class is based on the basic principle of last-in-first-out. 
  In addition to the basic push and pop operations, the class provides three more functions of empty, search, and peek.

  To declare stack:
  Stack<E> stack = new Stack<E>();
 */