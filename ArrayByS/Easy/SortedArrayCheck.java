//time-complexity:O(N)

package DSA.ArrayByS.Easy;

public class SortedArrayCheck {
    /* 
    //non-decreasing order i.e; ascending
    static int checkSort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] >= arr[i-1]){
                
            }
            else{
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(checkSort(arr));
    }
    */

    //descending order
    static int checkSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] <= arr[i-1]){

            }
            else{
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        System.out.println(checkSort(arr));
    }
}
