package code;

public class OddEven {
    static void main(String[] args) {
        int n=66;
        // print whether number is odd
        System.out.println(isOdd(n));
        // print whether number is even
        System.out.println(isEven(n));
    }
    //(LSB)-> Least Significant Bit
    // method to check if a number is odd
    // A number is odd when its last bit (LSB) is 1
    static boolean isOdd(int n){
        return (n & 1)==1; // bitwise AND with 1 checks last bit
    }
    // method to check if a number is even
    // A number is even when its last bit (LSB) is 0
    static boolean isEven(int n){
        return (n & 1)==0; // bitwise AND with 1 checks last bit
    }
}
