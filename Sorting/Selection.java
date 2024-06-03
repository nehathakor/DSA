//time-complexity:O(n^2) || space-complexity: O(1) 
//It is advised to do swap in the first function only instead of making swap function

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
        int arr[] = {7,0,3,5,6};
        SelectionSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}


// static void Selection(int arr[], int n){
//     for (int i = 0; i < n-1; i++) {
//         int min = i;
//         for (int j = i+1; j < n; j++) {
//             if(arr[j] < arr[min]){
//                 min = j;
//             }
//         }
//         int temp = arr[i];
//         arr[i] = arr[min];
//         arr[min] = temp;
//     }

// }
// public static void main(String[] args) {
//     int arr[] = {3,4,5,2,0};
//     Selection(arr, arr.length);
//     System.out.println(Arrays.toString(arr));
// }