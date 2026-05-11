package assigment;

//https://leetcode.com/problems/account-balance-after-rounded-purchase/description/
//2806. Account Balance After Rounded Purchase

public class AccountBalanceAfterRoundedPurchase {
    static void main(String[] args) {
        int purchaseAmount = 15;
        System.out.println(accountBalanceAfterPurchase(purchaseAmount));
    }
    static int accountBalanceAfterPurchase(int purchaseAmount) {
        int nearest = Math.round(purchaseAmount / 10.0f) * 10;

        return 100-nearest;

    }
}