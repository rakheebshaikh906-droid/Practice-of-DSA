package code;
//Q. Given a number n,find the no.of set bits in it
public class SetBits {
    static void main(String[] args) {
        int n=128;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(countbits(n));
    }
    static int countbits(int n){
        int count=0;
        while(n!=0){
            count++;
            n-=(n&-n);//n&=(n-1)->this was also used this is the fastest version of this
        }
        return count;
    }
}
