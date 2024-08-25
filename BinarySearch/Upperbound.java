//time-complexity:O(logn) || space-complexity: O(1) 

package BinarySearch;

public class Upperbound {
    static int Upper(int arr[], int target, int n){
        int low = 0, high = n-1;
        int ans = n;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] > target){
                ans = mid;
                high = mid-1;
            } else{
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,2,4,6};
        System.out.println(Upper(arr, 2, arr.length));
    }
}
