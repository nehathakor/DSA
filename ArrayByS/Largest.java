//time-complexity:O(N)

package DSA.ArrayByS;

public class Largest {
    static int largestElement(int arr[]){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {3,5,1,3,9,88};
        System.out.println(largestElement(arr));
    }
}
