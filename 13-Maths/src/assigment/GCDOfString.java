package Assigment;

//https://leetcode.com/problems/greatest-common-divisor-of-strings/description/?envType=problem-list-v2&envId=math
//1071. Greatest Common Divisor of Strings
public class GCDOfString {
    static void main(String[] args) {
        String str1="ABCABC";
        String str2="ABC";

        System.out.println(gcdOfString(str1,str2));
    }
    static String gcdOfString(String str1,String str2){
        if(!(str1+str2).equals(str2+str1)) return "";

        int  len=gcd(str1.length(),str2.length());

        return str1.substring(0,len);

    }
    static int gcd(int a,int b){
        while( b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
