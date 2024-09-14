package BinarySearch;

import java.util.Arrays;

public class FirstLast {
    static int[] FL(int arr[], int x){
        int[] result = new int[2];
        result[0] = First(arr, x);
        result[1] = Last(arr, x);

        return result;
    }

    static int First(int arr[], int x){
        int l = 0; 
        int h = arr.length-1;
        int ans = -1;

        while(l <= h){
            int mid = l+(h-l)/2;

            if(arr[mid] >= x){
                if(arr[mid] == x){
                   ans = mid;
                }
                h = mid-1;
            }else{
                l = mid+1;
            }
        }
        return ans;
    }

    static int Last(int arr[], int x){
        int l = 0; 
        int h = arr.length-1;
        int ans =-1;

        while(l <= h){
            int mid = l+(h-l)/2;

            if(arr[mid] <= x){
                if(arr[mid] == x){
                    ans = mid;
                }
                l = mid+1;
            } else{
                h = mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={5,7,7,8,8,10};
        System.out.println(Arrays.toString(FL(arr,8)));
    }
}
