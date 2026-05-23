package Assigment;

//https://leetcode.com/problems/count-symmetric-integers/description/
//2843. Count Symmetric Integers

public class CountSymmetricIntegers {
    static void main(String[] args) {
        int low=1;
        int high=100;
        System.out.println(countSymmetric(low,high));
    }
    static int countSymmetric(int low,int high){
        int count=0;
        for(int i=low;i<=high;i++){
            String j = Integer.toString(i);
            if(j.length()%2!=0){
                continue;
            }
            int n=j.length();
            int sum1=0;
            int sum2=0;
            for(int k=0;k<n/2;k++){
                sum1+=j.charAt(k)-'0';
                sum2+=j.charAt(k+n/2)-'0';
            }
            if(sum1==sum2){
                count++;
            }
        }
        return count;
    }
}
