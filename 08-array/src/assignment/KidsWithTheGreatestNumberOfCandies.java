package assignment;

//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/?envType=problem-list-v2&envId=array
//1431. Kids With the Greatest Number of Candies

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    static void main(String[] args) {
        int[]candies={2,3,5,1,3};
        int extraCandies=3;
        System.out.println(kidsWithCandies(candies,extraCandies));
    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean>ans=new ArrayList<>();

        int n=candies.length;
        for(int i=0;i<n;i++){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<n;j++){
                if(i==j) continue;

                if(candies[j]>max){
                    max=candies[j];
                }
            }
            if(candies[i]+extraCandies>=max){
                ans.add(i,true);
            } else {
                ans.add(i,false);
            }
        }
        return ans;

    }
}
