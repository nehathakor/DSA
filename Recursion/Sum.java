package DSA.Recursion;

public class Sum {
    static void F(int i, int sum){
        if(i < 1){
            System.out.println(sum);
            return;
        }
        F(i-1,sum+i);
    }

    public static void main(String[] args) {
        F(5,0);
    }
}
