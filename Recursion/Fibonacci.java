//time-complexity: O(n^2)

public class Fibonacci {
    static int F(int n){
        if(n <= 1){
            return n;
        }
        F(n-1);
        F(n-2);
        return F(n-1)+F(n-2);
    }

    public static void main(String[] args) {
        System.out.println(F(4));
    }
}
