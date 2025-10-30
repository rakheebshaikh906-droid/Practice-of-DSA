package com.asim;

//import java.util.Scanner;

public class TypeCasting {
    // type casting
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);

//        // type casting
//        int num = (int)(45.69f);
//        System.out.println(num);

        // automatic type promotion in expression
//        int a = 257;
//        byte b = (byte)(a); // 257 % 256 = 1
//        System.out.println(b);
//
//        byte a = 10 ;
//        byte b = 5 ;
//        byte c = 2 ;
//        int d = a * b / c;
//        System.out.println(d);

//        byte b = 50;
//        b = b * 2; // error because upcasting

//          int number = 'A'; // sky value of A = 65
//          int num = 'a'; // sky value of a = 97
//          System.out.println(num + number); // 162

          byte b = 10;
          char c = 'a';
          short s = 1000;
          int i = 3848;
          float f = 12.34f;
          double d = 654.5346;

          double result = (b * c)+(i-s)+(d+f);

        System.out.println((b * c)+" "+(i-s)+" "+(d+f));
        System.out.println(result);

    }

}
