//https://www.codingninjas.com/studio/problems/sum-of-all-divisors_8360720

//time-complexity: O(n*sqrt(n)) || space-complexity: O(1)

package DSA.Maths;

public class Divisiors {
    static int myDivisior(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if(i%j == 0){
                    sum += j;
                    if((i/j) != j){
                        sum += (i/j);
                    }
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(myDivisior(36));
    }
}
