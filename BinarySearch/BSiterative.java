//time-complexity:O(logn) || space-complexity: O(1) 

package BinarySearch;

public class BSiterative {
    static int BS(int arr[], int n, int target) {
        int low = 0;
        int high = n - 1;

        while (low <= high) {   //<= is important here
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        System.out.println(BS(arr, arr.length, 4));
    }
}
