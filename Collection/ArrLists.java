package DSA.Collection;

import java.util.ArrayList;

public class ArrLists {
    public static void main(String[] args) {
        ArrayList<String> studentName = new ArrayList<>();
        studentName.add("Neha");
        studentName.add("Deepika");
        studentName.add("Rachit");

        //To add element in the arraylist at any index
        studentName.add(1,"Riya");
        System.out.println(studentName);

        ArrayList<String> newlist  = new ArrayList<>();
        newlist.add("N");
        newlist.add("R");
        newlist.add("D");

        

        newlist.addAll(studentName);
        System.out.println(newlist);

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