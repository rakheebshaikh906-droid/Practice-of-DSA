package Assigment;

// this was a weekly context problem

public class SumOfCompatibleNumbersInRangeI {
    static void main(String[] args) {
        int n=5;
        int k=100;

        System.out.println(sumOfGoodIntegers(n,k));
    }
    static int sumOfGoodIntegers(int n, int k){
        int sum=0;
        for(int x=1;x<=(n+k);x++){
            if(Math.abs(n-x)<=k && (n & x)==0){
                sum+=x;
            }
        }
        return sum;
    }
}
