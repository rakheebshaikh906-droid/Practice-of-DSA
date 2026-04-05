package assignment;

//https://leetcode.com/problems/maximum-matching-of-players-with-trainers/description/?envType=problem-list-v2&envId=two-pointers
//2410. Maximum Matching of Players With Trainers

import java.util.Arrays;

public class MaximumMatchingOfPlayersWithTrainers {
    static void main(String[] args) {
        int[]player={4,7,9};
        int[]trainers={8,2,5,8};
        System.out.println(matchPlayersAndTrainers(player,trainers));
    }
    static int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int count=0;
        Arrays.sort(players);
        Arrays.sort(trainers);
        int left=0;
        int right=0;
        while(left<players.length && right<trainers.length){
            if(players[left]<=trainers[right]){
                count++;
                left++;
                right++;
            }else{
                right++;
            }
        }
        return count;

    }
}
