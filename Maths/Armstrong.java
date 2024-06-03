//https://www.codingninjas.com/studio/problems/check-armstrong_589

//time-complexity:O(log10n) || space-complexity: O(1) 

public class Armstrong {
    static boolean myArm(int num){
        int digit = (int) (Math.log10(num) + 1);
        int temp = num;
        int sum = 0;

        while(temp > 0){
            int lastdigit = temp % 10;
            sum += (int) Math.pow(lastdigit,digit);
            temp/=10;
        }

        if(sum == num){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(myArm(371));
    }
}
