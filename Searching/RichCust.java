//https://leetcode.com/problems/richest-customer-wealth/

public class RichCust {
    static int maximumWealth(int[][] accounts){
        int temp = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if(sum > temp){
              temp = sum;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[][] accounts = {
        {2,3},
        {6,7,1}
        };

        System.out.println(maximumWealth(accounts));
    }
}
