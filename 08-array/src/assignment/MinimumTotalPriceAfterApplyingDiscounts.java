package assignment;

//https://leetcode.com/problems/minimum-total-price-after-applying-discounts/
//4014. Minimum Total Price After Applying Discounts

import java.util.Arrays;
public class MinimumTotalPriceAfterApplyingDiscounts {
    static void main(String[] args) {
       int[] prices = {8,12}, discounts = {40,17,59,32,11,72,18,33,52,42};
        System.out.println(minPrice(prices,discounts));
    }
    static double minPrice(int[] prices, int[] discounts) {
        double ans=0;
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int p=prices.length-1;
        int d= discounts.length-1;

        while(p>=0 && d>=0){
            ans+= (double) (prices[p] * (100 - discounts[d])) / 100;
            p--;
            d--;
        }
        while(p>=0){
            ans+=prices[p];
            p--;
        }
        return ans ;

    }
}
