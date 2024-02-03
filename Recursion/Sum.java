package DSA.Recursion;

public class Sum {
    //Parameterised Recursion:
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

    /*
    //Functional Recursion:

    static int F(int n){
    if(n == 0){
        return 0;
    }
    return n+F(n-1);
    }

    public static void main(String[] args) {
    System.out.println(F(3));
    }
     */
}
