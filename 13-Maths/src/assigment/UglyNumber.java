package Assigment;

//https://leetcode.com/problems/ugly-number/description/
//263. Ugly Number
public class UglyNumber {
    static void main(String[] args) {
        int n=6;
        System.out.println(uglyNumber(n));
    }
    static boolean uglyNumber(int n){
        if(n<=0){
            return false;
        }
        int [] numbers={2,3,5};
        for(int p : numbers){
            while(n%p==0){
                n=n/p;
            }
        }
        return n==1;//its this condition will true return else return false
    }
}
