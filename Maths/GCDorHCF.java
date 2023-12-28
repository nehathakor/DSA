//https://www.codingninjas.com/studio/problems/hcf-and-lcm_840448

//time-complexity: O(logφ(min(a, b))) || space-complexity: O(1)

package DSA.Maths;

public class GCDorHCF {
    static int myGCD(int a, int b){
        while(a > 0 && b > 0){
            if(a > b){
                a%=b;
            }else{
                b%=a;
            }
        }
        if(a == 0){
           return b;
        }
        else{
            return a;
        }
    }

    public static void main(String[] args) {
        System.out.println(myGCD(11,13));
    }
}
