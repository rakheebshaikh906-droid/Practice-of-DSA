package code;

public class NoOfDigits {
    static void main(String[] args) {
        int n=7637635;
        int b=10;
        System.out.println(digits(n,b));
    }
    static int digits(int n,int b){
        return (int) (Math.log(n) / Math.log(b)) + 1;
    }
}