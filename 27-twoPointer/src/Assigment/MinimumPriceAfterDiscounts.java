
package Assigment;

import java.util.Arrays;

// Minimum Price After Applying Discounts

public class MinimumPriceAfterDiscounts {

    static void main(String[] args) {
        int[] prices = {100, 200, 300};
        int[] discounts = {10, 20};

        System.out.println(minPrice(prices, discounts));
    }

    public static double minPrice(int[] prices, int[] discounts) {
        double ans = 0;

        Arrays.sort(prices);
        Arrays.sort(discounts);

        int p = prices.length - 1;
        int d = discounts.length - 1;

        while (p >= 0 && d >= 0) {
            ans += (double) (prices[p] * (100 - discounts[d])) / 100;

            p--;
            d--;
        }

        while (p >= 0) {
            ans += prices[p];
            p--;
        }

        return ans;
    }
}
