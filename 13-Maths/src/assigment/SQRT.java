package Assigment;

//https://leetcode.com/problems/sqrtx/description/
//69. Sqrt(x)
public class SQRT {
    static void main(String[] args) {
        int n=8;
        System.out.println(square(n));
    }
    static int square(int n){
        int s=0;
        int e=n;
        while(s<=e){
            int m=s+(e-s)/2;
            long sq=(long)m*m; //used long to avoid overflow
            if(sq==n){
                return m;
            }
            if(sq>n){
                e=m-1;
            }else{
                s=m+1;
            }
        }
        return e;//floor of sqrt(n)
    }
}
