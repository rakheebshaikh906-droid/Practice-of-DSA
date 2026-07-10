package code;

public class PowerOfTwo {
    static void main(String[] args) {
        int n=16;
        System.out.println(powerOf(n));
    }
    static boolean powerOf(int n){
        return (n&(n-1))==0;
    }
}
