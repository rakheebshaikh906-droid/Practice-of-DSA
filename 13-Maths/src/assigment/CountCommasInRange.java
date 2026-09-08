package Assigment;

//https://leetcode.com/problems/count-commas-in-range/
//3870. Count Commas in Range

public class CountCommasInRange {
    static void main(String[] args) {
        int n=10004;
        System.out.println(countCommas(n));
    }
    static int countCommas(int n){
        if(n<1000){
            return 0;
        }
        if(n==1000){
            return 1;
        }
        int ans=0;
        if(n>1000){
            ans+=(n-1000)+1;
        }
        return ans;

    }
}
