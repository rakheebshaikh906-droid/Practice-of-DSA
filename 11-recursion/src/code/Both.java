package code;
//Q.print the number from 1 to n & n to 1
public class Both {
    static void main(String[] args) {
        funBoth(5);
    }
    static void funBoth(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        funBoth(n-1);
        System.out.println(n);
    }
}
