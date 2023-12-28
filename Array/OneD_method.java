package DSA.Array;

import java.util.*;

class OneD_method {
/*     static void myMethod(){      //printing array using user input
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }
        System.out.println(Arrays.toString(arr));
        sc.close();
    } 

    public static void main(String[] args) {
        myMethod();
        myMethod();
    }  */

   /*  static void myMethod(int[] arr){        //printing using parameter
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7};
        myMethod(arr);
    }  */
  
    public static void main(String[] args) {     //Finding minimum number in arrays
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Mininmum of the array is: ");
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min);
        sc.close();
    }
}
