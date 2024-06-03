//time-complexity:O(N) || space-complexity:O(N)

import java.util.Arrays;

public class LeftRotateOne {
    static int[] LeftRotate(int arr[]){
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {4,9,6,4,3,0};
        LeftRotate(arr);
        System.out.println(Arrays.toString(arr));
    }
}
