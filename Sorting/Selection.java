//time-complexity:O(n^2) || space-complexity: O(1) 

package DSA.Sorting;

import java.util.Arrays;

public class Selection {
    static void SelectionSort(int arr[],int n){
        for (int i = 0; i <= n-2; i++) {
            int min = i;
            for (int j = i; j <= n-1; j++) {
                if(arr[j] < arr[min]){
                    min = j;
                }
                swap(arr,min,i);
            }
        }
    }

    static void swap(int arr1[], int i, int j){
        int temp = arr1[i];
        arr1[i] = arr1[j];
        arr1[j] = temp; 
    }

    public static void main(String[] args) {
        int arr[] = {2,0,4,5,7};
        SelectionSort(arr,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
