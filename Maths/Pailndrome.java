//https://leetcode.com/problems/palindrome-number/

//Time-complexity: O(log10n) || space-complexity : O(1)

package DSA.Maths;

public class Pailndrome {
    static boolean myPalin(int num){
        int temp = num;
        int reverse = 0;
        while(temp > 0){
            reverse = (reverse * 10) + (temp % 10);
            temp/=10;
        }

        if(reverse == num){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(myPalin(-123));
    }
}
