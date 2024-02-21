//space-complexity:O(n+d) and space-complexity:O(n) since  we using temp so to reduce it we use reverse

package DSA.ArrayByS.Easy;

import java.util.Arrays;

public class LeftRotatebyD {
    static void leftRotate(int arr[], int n, int d){
        d = d%n;
        int temp[] = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        for (int i = d; i < n; i++) {
            arr[i-d] = arr[i];
        }

        for (int i = n-d; i < n; i++) {
            arr[i] = temp[i-(n-d)];
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        leftRotate(arr,arr.length,13);
        System.out.println(Arrays.toString(arr));
    }
}
