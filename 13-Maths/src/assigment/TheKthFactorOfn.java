package Assigment;

//https://leetcode.com/problems/the-kth-factor-of-n/description/?envType=problem-list-v2&envId=math
//1492. The kth Factor of n

public class TheKthFactorOfn {
    static void main(String[] args) {
        int n=7;
        int k=2;
        System.out.println(KthFactor(n,k));
    }
    static int KthFactor(int n,int k){
        int[]ans = new int[n];
        int index=0;
        if(n<=k){
            return -1;
        }
        for(int i=1;i<=n;i++){
            if(n%i==0){
               ans[index]=i;
               index++;
            }
        }
        return ans[k-1];
    }
    //best ans 0(n) method
    static int kthFactor2(int n, int k) {
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
            if(count==k){
                return i;
            }
        }
        return -1;
    }
}
