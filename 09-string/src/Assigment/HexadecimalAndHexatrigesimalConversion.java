package Assigment;

//https://leetcode.com/problems/hexadecimal-and-hexatrigesimal-conversion/?envType=problem-list-v2&envId=math
//3602. Hexadecimal and Hexatrigesimal Conversion

public class HexadecimalAndHexatrigesimalConversion {
    static void main(String[] args) {
        int n=13;
        System.out.println(concatHex36(n));
    }
    static String concatHex36(int n) {
        long n2=n*n;
        long n3=n2*n;

        String hexadecimal=Long.toString(n2,16);
        String hexatrigesimal=Long.toString(n3,36);

        return(hexadecimal+hexatrigesimal).toUpperCase();
    }
}
