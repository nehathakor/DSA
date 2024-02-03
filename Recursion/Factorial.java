//time-complexity: O(n)|| space-complexity: O(n)

package DSA.Recursion;

public class Factorial {
    static int F(int n){
        if(n == 1){
            return 1;
        }
        return n*F(n-1);
       }
    
       public static void main(String[] args) {
        System.out.println(F(5));
       }
}
