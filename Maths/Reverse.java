//https://leetcode.com/problems/reverse-integer/description/

//time-complexity : O(log10n) || space-complexity : O(1) sice all are variables and no data structure

package DSA.Maths;

public class Reverse {
    static int myReverse(int x){
        boolean sign = true;
        if(x < 0){
            sign = false;
        }

        x = Math.abs(x);
        long rev = 0;
        while(x > 0){
            rev = (rev * 10) + (x % 10);
            x /= 10;
        }

        if(rev > Integer.MAX_VALUE){
            return 0;
        }

        if(sign == false){
            return (-1)*(int)rev;
        }else{
            return (int)rev;
        }
    }

    public static void main(String[] args) {
        System.out.println(myReverse(5678364));
    }
}
