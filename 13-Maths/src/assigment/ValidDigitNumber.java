package Assigment;

public class ValidDigitNumber {
    static void main(String[] args) {
        int n=232;
        int x=2;
        System.out.println(validDigit(n,x));
    }
    static boolean validDigit(int n, int x) {
        String m = Integer.toString(n);
        for(int i=0;i<m.length();i++){
            if(m.charAt(0)-'0'!=x && m.charAt(i)-'0'==x){
                return true;
            }
        }
        return false;
    }
}
