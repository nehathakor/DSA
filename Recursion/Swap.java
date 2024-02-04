//Swap an array using functional recursion:

package DSA.Recursion;

import java.util.Arrays;

public class Swap {
    static void swap(int a[],int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static void F(int a[],int l,int r){
        if(l >= r){
            return;
        }
        swap(a,l,r);
        F(a,l+1,r-1);
    }

    public static void main(String[] args) {
        int a[] = {3,8,90,2};
        F(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
}