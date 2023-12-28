package DSA.Array;

import java.util.*;

public class ArrList {
  public static void main(String[] args) {
  /*   ArrayList<Integer> list = new ArrayList<>();       //user input 
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < 5; i++) {
      list.add(sc.nextInt());
    }
    System.out.println(list);
    sc.close(); */
  /* 
    ArrayList<String> list = new ArrayList<>();
    list.add("Hello");
    list.add("Guys");
    list.add("Welcome");
    list.add("To");
    list.add("India");
  */
   // System.out.println(list);                 //direct output

  /*  for(String n : list){
    System.out.println(n);                     //output using for-each
   }  */

   // System.out.println(list.contains("To"));    //to check if an object exists  

   //System.out.println(list.get(2));       //to access the element using index

  /*  list.set(4,"Canada");                //to modify an element
   System.out.println(list); 
    */
 
   /*  list.remove("Guys");                //to remove an element from the list
    System.out.println(list);
  */

  /* list.clear();                       //to remove all elements in the list
  System.out.println(list);
   */

  // System.out.println(list.size());

  /* ArrayList<String> list = new ArrayList<String>();   //user input
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            String input = sc.nextLine();
            list.add(input);
        }

        System.out.println(list);
        */

  /* ArrayList<ArrayList<String>> mlist = new ArrayList<>();     //multidimension ArrayList 
    ArrayList<String> blist = new ArrayList<>();
    blist.add("pasta");
    blist.add("garlic bread");
    blist.add("donuts");

    ArrayList<String> plist = new ArrayList<>();
    plist.add("pasta");
    plist.add("garlic bread");
    plist.add("donuts");

    mlist.add(blist);
    mlist.add(plist);
        
    System.out.println(mlist);
*/

  ArrayList<ArrayList<Integer>> list = new ArrayList<>();      //Multidimension ArrayList in a list //userinput
  Scanner in = new Scanner(System.in);
  for (int i = 0; i < 3; i++) {          //initialising 3 lists
    list.add(new ArrayList<>());
  }

  for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {      //adding values in 3 lists
      list.get(i).add(in.nextInt());
    }
  }
  System.out.println(list);
  in.close();
  } 
}





