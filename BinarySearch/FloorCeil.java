package BinarySearch;

import java.util.Arrays;

public class FloorCeil {
    static int[] FC(int[] arr, int x){
        int[] result = new int[2];
        result[0] = floor(arr,x);
        result[1] = ceil(arr,x);

        return result;
    }

    static int floor(int arr[], int x){
        int l = 0; 
        int h = arr.length-1;
        int ans = -1;

        while(l <= h){
            int mid = l+(h-l)/2;

            if(arr[mid] <= x){
                ans = arr[mid];
                l = mid+1;
            }else{
                h = mid-1;
            }
        }
        return ans;
    }

    static int ceil(int arr[], int x){
        int l = 0; 
        int h = arr.length-1;
        int ans = -1;

        while(l <= h){
            int mid = l+(h-l)/2;

            if(arr[mid] >= x){
                ans = arr[mid];
                h = mid-1;
            }else{
                l = mid+1;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int arr[] = {3, 4, 7, 8, 8, 10};
        System.out.println(Arrays.toString(FC(arr,5)));
    }
}
