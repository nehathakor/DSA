//Print 1 to n 

package DSA.Recursion;

public class R2 {
    static void F(int i, int n){
        if(i > n){
            return;
        }
        System.out.println(i);
        F(i+1,n);
    }

    public static void main(String[] args) {
        F(1,5);
    }

    /*
     static int F(int i, int n){
        if(i > n){
            return n;
        }
        System.out.println(i);
        return F(i+1,n);
    }

    public static void main(String[] args) {
        F(1,5);
    }
     */

     /* Using Backtracking:
        static void F(int i, int n){
        if(i < 1){
            return;
        }
        F(i-1,n);
        System.out.println(i);
        }

        public static void main(String[] args) {
            F(5,5);
        }
     */
}
