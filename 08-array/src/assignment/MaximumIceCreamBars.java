package assignment;

//https://leetcode.com/problems/maximum-ice-cream-bars/description/?envType=problem-list-v2&envId=counting-sort
//1833. Maximum Ice Cream Bars

import java.util.Arrays;

public class MaximumIceCreamBars {
    static void main(String[] args) {
        int[]costs={1,6,3,1,2,5};
        int coins=20;
        System.out.println(maxIceCream(costs,coins));
    }
    static int maxIceCream(int[]costs,int coins){
        Arrays.sort(costs);
        int count=0;
        int sum=0;
        for(int i=0;i<costs.length;i++){
            if(costs[i]>coins){
                return 0;
            }
            sum+=costs[i];
            count++;
            if(sum==coins){
                break;
            }
        }
        return count;
    }
}
