//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

/* 
public class EvenNum {
    static int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            int count1 = 0;
            while(nums[i] > 0){
                count1++;
                nums[i] /= 10;
            }
            if(count1 % 2 == 0){
            count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {23,567,12,1234,9};
        System.out.println(findNumbers(nums));
    }
}
*/

public class EvenNum {
    static int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){                 //another way to find numbers of digit
            int count1 = (int)(Math.log10(nums[i]) + 1);

            if(count1 % 2 == 0){
            count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {23,567,12,1234,9,3345};
        System.out.println(findNumbers(nums));
    }
}


