package Assigment;

import java.util.Arrays;

//https://leetcode.com/problems/count-primes/
//204. Count Primes
public class CountPrime {
    static void main(String[] args) {
        int n=10878;//expected out 4 because in the
                 //range of 1 to 10 there are 4 prime number are present
        System.out.println(primeCount(n));
        System.out.println(countPrimes(n));
    }
    static int primeCount(int n){
        int count=0;
        if(n<=2){
            return 0;
        }
        for(int i=2;i<=n;i++){
            int c=2;
            boolean isPrime=true;
            while(c*c<=i){
                if(i%c==0){
                    isPrime=false;
                    break;
                }
                c++;
            }
            if(isPrime){
                count++;
            }
        }
        return count;
    }
    //they are the fastest method as compare to above method
    static int countPrimes(int n) {
        if (n <= 2) return 0;
        boolean[] prime = new boolean[n];
        Arrays.fill(prime, true);

        prime[0] = false;
        prime[1] = false;

        for (int i = 2; i * i < n; i++) {
            if (prime[i]) {
                for (int j = i * i; j < n; j += i) {
                    prime[j] = false;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (prime[i]) count++;
        }
        return count;
    }
}

