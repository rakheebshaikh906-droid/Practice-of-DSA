package Assigment;

//https://leetcode.com/problems/number-of-laser-beams-in-a-bank/description/?envType=problem-list-v2&envId=math
//2125. Number of Laser Beams in a Bank

public class NumberOfLaserBeamsInABank {
    static void main(String[] args) {
        String[]bank={"011001","000000","010100","001000"};
        System.out.println(numberOfBeams(bank));
    }
    static int numberOfBeams(String[] bank) {
        int ans=0;
        int previous=0;
        for(int i=0;i<bank.length;i++){
            int count=0;
            for(int j=0;j<bank[i].length();j++){
                if(bank[i].charAt(j)=='1'){
                    count++;
                }
            }
            if (count == 0) {
                continue;
            }
            if (previous != 0) {
                ans += previous * count;
            }
            previous = count;
        }
        return ans;
    }
}
