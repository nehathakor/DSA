package DSA.Collection;

import java.util.*;

public class ArrLists {
    public static void main(String[] args) {
        ArrayList<String> studentName = new ArrayList<>();
        studentName.add("Neha");
        studentName.add("Deepika");
        studentName.add("Rachit");

        //To add element in the arraylist at any index || T.C - O(n)
        studentName.add(1,"Riya");
        System.out.println(studentName);

        ArrayList<String> newlist  = new ArrayList<>();  
        newlist.add("N");
        newlist.add("R");
        newlist.add("D");

        //To merge two arraylist || T.C - O(n)
        newlist.addAll(studentName);
        System.out.println(newlist);

        //to get indexed element || T.C - O(1)
        System.out.println(newlist.get(6));

        //to remove element by index position.. also note that u can't specify directly in sout || T.C - O(n)
        newlist.remove(6);
        System.out.println(newlist);

        //to remove element by object || T.C - O(n)
        newlist.remove(String.valueOf("Riya"));
        System.out.println(newlist);
        /* 
        //to remove list from a list
        newlist.removeAll(studentName);
        System.out.println(newlist);
        */

        /* 
        //clear complete list
        newlist.clear();
        System.out.println(newlist);
        */

        //to set new element at a predefined index
        newlist.set(1,"T");
        System.out.println(newlist);
 
        //to check if an element do exists or not || T.C - O(n)
        System.out.println(newlist.contains("Neha"));
        /* 
        //to check if a list exists in another list
        System.out.println(newlist.containsAll(studentName));
        */

        //Looping in the list:
        for (int i = 0; i < newlist.size(); i++) {
            System.out.println(newlist.get(i));
        }

        for(String str : newlist){  //recommended
            System.out.println(str);
        }

        Iterator<String> it = newlist.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

/*
 Java ArrayList is a part of the Java collection framework and it is a class of java.util package.
 It provides us with dynamic arrays in Java. 
 Though, it may be slower than standard arrays but can be helpful in programs where lots of manipulation in the array is needed. 
 The main advantage of Java ArrayList is, if we declare an array then we need to mention the size, but in ArrayList, it is not needed to mention the size of ArrayList.

 To declare arraylist:
 ArrayList<Integer> arrli = new ArrayList<Integer>();
*/