//time-complexity:O(n^2) || space-complexity: O(1) 
//It is advised to do swap in the fist function only instead of making swap function

package DSA.Sorting;

import java.util.Arrays;

public class Bubble {
    static void bubbleSort(int arr[],int n){
        for (int i = n-1; i >= 1; i--) {
            for (int j = 0; j <= i; j++) {
                if(arr[j] > arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }

    static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {2,0,5,3,1};
        bubbleSort(arr, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
