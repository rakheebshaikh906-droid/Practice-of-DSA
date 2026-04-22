package Assigment;

//https://leetcode.com/problems/n-th-tribonacci-number/description/
//1137. N-th Tribonacci Number
public class TribonacciNumber {
    static void main(String[] args) {
        int n = 4;
        System.out.println(Tribonacci(n));
        System.out.println(tribonacci(4));
    }
    //but this will not accept at leetcode because large number this will give time exceed error
    static int Tribonacci(int n){
        if(n==0)return 0;
        if(n==1||n==2) return 1;

        return Tribonacci(n-1)+ Tribonacci(n-2)+ Tribonacci(n-3);
    }
    static int tribonacci(int n){
        int[]arr={0,1,1};
        if(n<=2){
            return arr[n];
        }
        for(int i=3;i<=n;i++){
            int temp=arr[0]+arr[1]+arr[2];
            arr[0]=arr[1];
            arr[1]=arr[2];
            arr[2]=temp;
        }
        return arr[2];
    }
}
