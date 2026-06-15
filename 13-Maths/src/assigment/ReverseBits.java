package Assigment;

public class ReverseBits {
    static void main(String[] args) {
        int n=43261596;
        System.out.println(reverse(n));
    }
    static int reverse(int n){
        String binary=Integer.toBinaryString(n);
        String reversed=new StringBuilder(binary).reverse().toString();

        return Integer.parseInt(reversed,2);
    }
}
