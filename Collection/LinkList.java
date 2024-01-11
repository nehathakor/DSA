package DSA.Collection;

import java.util.*;

public class LinkList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Cherry");
        list.add("Mango");

        System.out.println(list);

        //to set element at a index
        list.set(1,"Blueberry");
        System.out.println(list);

        //to get a specified indexed element
        System.out.println(list.get(2));

        //to remove element
        list.remove("Mango");
        System.out.println(list);

        //to add element at first and at last
        list.addFirst("Mango");
        list.addLast("Grapes");
        System.out.println(list);

        //Similarly we have removeFirst and removeLast to remove furst and last element in list. And getFirst and getLast element to get the first last element
        list.removeFirst();
        System.out.println(list.getFirst());
    }   
}

/*
 Linked List is a part of the Collection framework present in java.util package. 
 This class is an implementation of the LinkedList data structure which is a linear data structure where the elements are not stored in contiguous locations and every element is a separate object with a data part and address part. 
 The elements are linked using pointers and addresses. Each element is known as a node. 

 Use an ArrayList for storing and accessing data, and LinkedList to manipulate data.
 */