//time-complexity:O(N+M) || space-complexity:O(1)  N,M - size of array

import java.util.*;

class UnionOfArray{
    static ArrayList<Integer> Union(int arr1[], int arr2[]){
        int i = 0, j = 0;
        ArrayList<Integer> union = new ArrayList<Integer>();
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] <= arr2[j]){
                if(union.size() == 0 || union.get(union.size()-1) != arr1[i])
                union.add(arr1[i]);
                i++;
            }
            else{
                if(union.size() == 0 || union.get(union.size()-1) != arr2[j])
                union.add(arr2[j]);
                j++;
            }
        }

        while(i < arr1.length){
            if(union.get(union.size()-1) != arr1[i])
                union.add(arr1[i]);
                i++;
        }

        while(j < arr2.length){
            if(union.get(union.size()-1) != arr2[j])
                union.add(arr2[j]);
                j++;
        }
        return union;
    }

    public static void main(String args[]){
        int arr1[] = {1,2,2,2,3,4,6,6,7};
        int arr2[] = {5,6,6,6,8,8,10};
        ArrayList<Integer> union = Union(arr1,arr2);
        for(int val: union){
            System.out.print(val + " ");
        }
    }
}