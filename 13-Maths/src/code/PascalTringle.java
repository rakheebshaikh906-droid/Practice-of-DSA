package code;

public class PascalTringle {
    static void main(String[] args) {
        int n=5;
        System.out.println(sumOf(n));
    }
    static int sumOf(int n){
        return 1<<n;
    }
}
