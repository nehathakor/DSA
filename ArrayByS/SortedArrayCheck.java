//time-complexity:O(N)

package DSA.ArrayByS;

public class SortedArrayCheck {
    //non-decreasind order i.e; ascending
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
}