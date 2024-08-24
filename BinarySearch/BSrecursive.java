//time-complexity:O(logn) || space-complexity: O(1) 

package BinarySearch;

public class BSrecursive {
    static int BS(int arr[], int low, int high, int target){
        if(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(target > arr[mid]){
                return BS(arr, mid+1, high, target);
            }
            return BS(arr, low, mid-1, target);
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {12, 3, 4, 10, 40};
        System.out.println(BS(arr, 0, arr.length, 10));
    }
}
