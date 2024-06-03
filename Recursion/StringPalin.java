
public class StringPalin {
    static boolean F(int i, int n, String s){
        if(i >= n/2){
            return true;
        }
        if(s.charAt(i) != s.charAt(n-i-1)){
            return false;
        }
        return F(i+1,n,s);
    }

    public static void main(String[] args) {
        String s = "madam";
        System.out.println(F(0,s.length(),s));
    }

    /*
    with two variables:
     static boolean F(int i,String s){
        if(i >= s.length()/2){
            return true;
        }
        if(s.charAt(i) != s.charAt(s.length()-i-1)){
            return false;
        }
        return F(i+1,s);
    }

    public static void main(String[] args) {
        String s = "MADAM";
        System.out.println(F(0,s));
    }
     */
}

//Note: In string length 0 se nahi but it starts from 1.. so NEHA mai length 4 hogi