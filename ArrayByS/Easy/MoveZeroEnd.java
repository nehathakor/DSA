//Time-complexity: O(n) || Space-complexity: O(1)

import java.util.Arrays;

public class MoveZeroEnd {
    static int[] Zero(int arr[]){
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

    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] ={0,3,4,0,2,40,0,8,0,0,2};
        int arr1[] = Zero(arr);
        System.out.println(Arrays.toString(arr1));
    }
}
