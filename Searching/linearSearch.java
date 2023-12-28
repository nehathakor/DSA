package DSA.Searching;

// import java.util.*;
public class linearSearch {
  /*   public static void main(String[] args) {   //Searching in numbers
        int[] arr = {2,5,6,13,9};
        int target = 13;
        System.out.println(Search(arr,target));
    }

    static int Search(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }  */

    /* public static void main(String[] args) {      //Searching character in string
        String name = "Neha";
        char target = 'h';
        System.out.println(Search(name,target));
    }

    static int Search(String str, char target){
        if(str.length() == 0){
            return -1;
        }

        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                return i;
            }
        }
        return -1;
    } */

    /* public static void main(String[] args) {         //Searching in range
        int[] arr = {3,5,8,2,10,46,-4,79,34,83};
        int target = -4;

        System.out.println(Search(arr,target,3,9));
    }

    static int Search(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }

        for (int i = start; i < end; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    } */

    /*  public static void main(String[] args) {
        int[][] arr ={
            {3,12,0,4},
            {40,7,9,2},
            {21,6,1,5}
        };
        int target = 13;
        int[] ans = Search(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] Search(int[][] arr,int target){
        if(arr.length == 0){
            return new int[]{-1,-1};
        } 

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                  return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    } */

    public static void main(String[] args) {    //maximum in 2D arrays
        int[][] arr = {
            {4,8,12,6},
            {3,5,9,45},
            {30,60}
        };
        System.out.println(max(arr));
    }

        static int max(int[][] arr){
               int max = Integer.MIN_VALUE;

               for (int row = 0; row < arr.length; row++) {
                for (int col = 0; col < arr[row].length; col++) {
                    if(arr[row][col] > max){
                        max = arr[row][col];
                    }
                }
            }
        return max;
    }
}


