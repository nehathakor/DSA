//https://www.codingninjas.com/studio/problems/count-digits_8416387

/* 
Basically is question mai apko ek number diya jayega lets say 336, toh mai digit se check karna hai ki voh divide hoga yh nhi. Jese 336 divide 
ho skta hai 3 se bhi or 6 se bhi. Since 3 do bar hai isliye iska output 3(count) hai.
*/

//Time complexity = O(log10n) || space-complexity : O(1)

public class Count {
    static int myCount(int num){
        int count = 0;
        int temp = num;
        if(num == 0){
            return 0;
        }

        while(temp > 0){
            int lastdigit = temp % 10;
            if(lastdigit != 0 && num%lastdigit==0){
                count++;
            }
            temp/=10;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(myCount(336));
    }
}
