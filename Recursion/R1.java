//Print name n times
//time-complexity: O(n)|| space-complexity: O(n)

public class R1 {
    static void F(int i ,int n){
        if(i > n){
            return;
        }
        System.out.println("Neha");
        F(i+1, n);
    }

    public static void main(String[] args) {
        F(1,5);
    }
}
