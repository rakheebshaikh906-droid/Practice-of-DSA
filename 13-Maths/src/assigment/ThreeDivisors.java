package Assigment;

//https://leetcode.com/problems/three-divisors/description/?envType=problem-list-v2&envId=math
//1952. Three Divisors
public class ThreeDivisors {
    static void main(String[] args) {
        int n=4;
        System.out.println(isThree(n));
    }
    //number exact 3 divisor tabhi hunga jab
    //1)number perfect square ho
    //2)uska square root prime ho

    static boolean isThree(int n){
        // step 1: n must be a perfect square
        int root = (int)Math.sqrt(n);
        //check if its a perfect square root or not
        if (root * root != n) {
            return false;
        }

        // step 2: root must be prime
        return isPrime(root);
    }

    // helper function to check prime
    static boolean isPrime(int num) {
        if (num <= 1){
            return false;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
