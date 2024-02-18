//time-complexity:O(N)

package DSA.ArrayByS.Easy;

public class SecondSmallest {
    static int second(int arr[]){
        int smallest = arr[0];
        int ssmallest = Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < smallest){
                ssmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i] > smallest && arr[i] < ssmallest){
                ssmallest = arr[i];
            }
        }
        return ssmallest;
    }

    public static void main(String[] args) {
        int arr[] = {2,1,4,5,6,0};
        System.out.println(second(arr));
    }
}
