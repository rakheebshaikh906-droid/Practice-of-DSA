package code;

public class OneToN {
    static void main(String[] args) {
        funRev(5);
    }
    static void funRev(int n){
        //base case
        if(n==0){
            return;
        }
        funRev(n-1);
        System.out.println(n);
    }
}
