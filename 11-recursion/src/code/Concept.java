package code;

public class Concept {
    static void main(String[] args) {
        int n=10;
        concept(n);
    }
    static void concept(int n){
        if(n==0){
            return;
        }
        System.out.println(n);

        // n-- vs --n  -> they are not same
        //concept(n--) -> the stack will overflow
        concept(--n);//this are the right method
    }
}
