
import java.util.Arrays;

public class Swap1 {
    static void swap(int a[], int i, int n){
        int temp = a[i];
        a[i] = a[n];
        a[n] = temp;
    }

    static void F(int a[], int i, int n){
        if(i >= n/2){
            return;
        }
        swap(a,i,n);
        F(a,i+1,n-i-1);
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        F(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
