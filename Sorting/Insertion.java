//time-complexity:O(n^2) || space-complexity: O(1) 
//For Best case: O(N)

package DSA.Sorting;

import java.util.Arrays;

public class Insertion {
    static void InsertionSort(int arr[]){
        for (int i = 0; i <= arr.length-1; i++) {
            int j = i;
            while(j > 0 && arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {3,7,1,0,4};
        InsertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
