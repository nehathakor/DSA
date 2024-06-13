// import java.util.Arrays;

import java.util.Arrays;

class Revision{
    static int[] myfunc(int[] arr){
      int j = -1;
      for (int i = 0; i < arr.length; i++) {
        if(arr[i] == 0){
          j = i;
          break;
        }
      }

      for (int i = j+1; i < arr.length; i++) {
        if(arr[i] != 0){
          swap(arr,i,j);
          j++;
        }
      }
      return arr;
    }

    static void swap(int arr[], int start, int end){
     int temp = arr[start];
     arr[start] = arr[end];
     arr[end] = temp;
    }
    
    public static void main(String[] args) {
        int arr[] = {1,0,3,4,6,0,7,8,0,9};
        int arr1[]=myfunc(arr);
        System.out.println(Arrays.toString(arr1));
    }
} 