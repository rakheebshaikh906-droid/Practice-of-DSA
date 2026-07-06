package code;

public class MagicNumber {
    static void main(String[] args) {
        int n=6;
        System.out.println(magic(n));
    }
    static int magic(int n){
        int ans=0;
        int base=5;
        while(n>0){
            int last=n & 1;
            n=n>>1;
            ans+=last*base;
            base=base*5;
        }
        return ans;
    }
}
