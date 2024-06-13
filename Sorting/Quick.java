//time-complexity:O(nlogn) || space-complexity: O(1) 


import java.util.Arrays;

public class Quick {
    static void quickSort(int arr[], int low, int high){
        if(low < high){
        int pIndex = partition(arr, low, high);
        quickSort(arr,low,pIndex-1);
        quickSort(arr,pIndex+1,high);
        }
    }

    static int partition(int arr[], int low, int high){
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i < j){
            while(arr[i] <= pivot && i < high){
                i++;
            }
            while(arr[j] > pivot && j > low){
                j--;
            }
            if(i < j){
                swap(arr,i,j);
            }
        }
        swap(arr,j,low);
        return j;
    }

    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {4,3,2,9,5,6};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
