package BinarySearch;

public class SearchSorted1 {
    static int Search(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;

        while(low <= high){
            int mid = low+(high-low)/2;

            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] >= arr[low]){
                if(arr[low] <= target && target <= arr[mid]){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }else{
                if(arr[high] >= target && target >= arr[mid]){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int ans = Search(arr, 7);
        System.out.println(ans);
    }
}
