//time-complexity:O(N) || space-complexity:O(1)

import java.util.Arrays;

public class RemoveDuplicate {
    static int duplicate(int arr[]){
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if(arr[j] != arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return (i+1);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,3};
        System.out.println(duplicate(arr));
        int arr1 = duplicate(arr);
        System.out.println(Arrays.toString(Arrays.copyOf(arr, arr1)));
    }
}
