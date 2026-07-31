package Assigment;

//https://leetcode.com/problems/happy-number/description/
//202. Happy Number
public class HappyNumber {
    static void main(String[] args) {
        int n=19;
        System.out.println(isHappy(n));
    }
    static boolean isHappy(int n){
        int slow=n;
        int fast=n;

        do{
            slow=square(slow);
            fast=square(square(fast));
        }while(slow!=fast);

        if(slow==1){
            return true;
        }
        return false;
    }

    static int square(int num){
        int ans=0;
        while(num>0){
            int rem=num%10;
            ans+=rem*rem;
            num/=10;
        }
        return ans;
    }
}
