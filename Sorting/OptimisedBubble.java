//time-complexity:O(N) || space-complexity: O(1) => Best Case when all arrays are sorted 


import java.util.Arrays;

public class OptimisedBubble {
    static void BubbleSort(int arr[]){
        for (int i = arr.length-1; i >= 1; i--) {
            int swapdone = 0;
            for (int j = 0; j <= i-1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapdone = 1;
                    System.out.println("runs"); //to check optimised condition
                }
            }
            if(swapdone == 0){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));

        
    }
}
