//time-complexity:O(logn) || space-complexity: O(1) 

package BinarySearch;

public class Lowerbound {
    static int Lower(int arr[], int target, int n){
        int low = 0, high = n-1;
        int ans = n;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] >= target){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {2,3,4,4,6};  //The array must be sorted else it will not work
        // Arrays.sort(arr);
        System.out.println(Lower(arr, 3, arr.length));
    }
}
