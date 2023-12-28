package DSA.Array;

import java.util.Arrays;

public class Program {
 /*   static void swap(int[] arr, int index1, int index2){  //swapping in arrays
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        System.out.println(Arrays.toString(arr));
      }

    public static void main(String[] args) {
      int[] arr = {2,3,45,7};
      swap(arr,1,3);
    } */
    
 /*    static int max(int[] arr){         //max of array
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            } 
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {6,3,19,7};
        System.out.println(max(arr));
    }   */

    static void swap(int[] arr, int index1, int index2){  //swapping in arrays
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
      }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length -1;

        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
      int[] arr = {2,3,45,7};
      reverse(arr);
      System.out.println(Arrays.toString(arr));
    }
}
