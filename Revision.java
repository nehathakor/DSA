import java.util.Arrays;

class Revision{
    static void Selection(int arr[], int n){
        for (int i = n-1; i >= 1; i--) {
            int didswap = 0;
            for (int j = 0; j <= i-1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didswap = 1;
                }
            }
            if(didswap == 0){
                System.out.println("It is here");
                break;
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = {2,6,3,1,9};
        Selection(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}