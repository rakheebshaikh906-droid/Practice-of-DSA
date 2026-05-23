package Assigment;

public class DivisibleAndNotDivisible {
    static void main(String[] args) {
        int n=10;
        int m=3;
        System.out.println(differenceOfSum(n,m));
    }
    static int differenceOfSum(int n,int m){
       int sum1=0;
       int sum2=0;

       for(int i=0;i<=n;i++){
           if(i%m!=0){
               sum1=sum1+i;
           }else{
               sum2=sum2+i;
           }
       }
       return sum1-sum2;
    }
}
