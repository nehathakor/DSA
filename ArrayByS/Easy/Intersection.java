//time-complexity:O(N+M) || space-complexity:O(MIN(n.m))  N,M - size of array

import java.util.*;

public class Intersection {
    static ArrayList<Integer> Intersect(int arr1[], int arr2[]){
        int i = 0, j = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                i++;
            }
            else if(arr2[j] > arr1[i]){
                j++;
            }
            else{
                // if(list.size() == 0 || list.get(list.size() - 1) != arr1[i]){       //removing duplicate
                //    list.add(arr1[i]);
                // }
                list.add(arr1[i]);
                i++;
                j++;
            }
        }

        return list;
    } 

    public static void main(String[] args) {
        int arr1[] = {1,2,2,3,3,4};
        int arr2[] = {2,3,3,8,9};

        ArrayList<Integer> list = Intersect(arr1,arr2);
        for(int val: list){
            System.out.print(val + " ");
        }


    }
}
