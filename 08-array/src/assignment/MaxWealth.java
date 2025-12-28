package assignment;
////leetcode.com/problems/richest-customer-wealth/solutions/7310240/1672-richest-customer-wealth-by-rakheebs-nvdq/
//Q.find maximum wealth of a customer
public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1}

        };

        System.out.println("Maximum wealth is: " + maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;

        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
