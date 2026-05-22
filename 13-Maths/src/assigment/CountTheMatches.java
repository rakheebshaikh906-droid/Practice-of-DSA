package Assigment;

//https://leetcode.com/problems/count-of-matches-in-tournament/description/
//1688. Count of Matches in Tournament
public class CountTheMatches {
    static void main(String[] args) {
        int n=7;
        System.out.println(countMatches(n));
    }
    static int countMatches(int n){
        int matches=0;
        while(n>1){
            if(n%2==0){
                matches=matches+n/2;
                n=n/2;
            }else{
                matches=matches+(n-1)/2;
                n=(n-1)/2+1;
            }
        }
        return matches;
    }
}
