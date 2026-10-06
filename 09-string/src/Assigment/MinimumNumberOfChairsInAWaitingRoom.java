package Assigment;

//https://leetcode.com/problems/minimum-number-of-chairs-in-a-waiting-room/
//3168. Minimum Number of Chairs in a Waiting Room

public class MinimumNumberOfChairsInAWaitingRoom {
    static void main(String[] args) {
        String s="ELEELEELLL";
        System.out.println(minimumChairs(s));
    }
    public static int minimumChairs(String s) {
        int enter=0; int max=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='E'){
                enter++;
            }else{
                enter--;
            }

            max=Math.max(max,enter);
        }
        return max;
    }
}
