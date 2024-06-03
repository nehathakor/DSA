//https://www.codingninjas.com/studio/problems/check-prime_624934

//time-complexity: O(sqrt(n)) || space-complexity: O(1)

public class Prime {
    static boolean myPrime(int n){
        int count = 0;
        for (int i = 1; i*i <= n; i++) {
            if(n%i == 0){
                count++;
                if((n/i) != i){
                    count++;
                }
            }
        }
        if(count == 2){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(myPrime(5));
    }
}
