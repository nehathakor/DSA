package DSA.ArrayByS;

public class SecondLargest {
    static int second(int arr[]){
        int largest = arr[0];
        int slargest = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > largest){
                slargest = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i] > slargest){
                slargest = arr[i];
            }
        }
        return slargest;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,7,7,5};
        System.out.println(second(arr));
    }
}
