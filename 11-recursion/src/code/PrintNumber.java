package code;

public class PrintNumber {
    //write a function that take a number and print it
    //print first 5 numbers:1 2 3 4 5
    static void main(String[] args) {
        num1(1);//start the chain
    }
    static void num1(int n) {
        System.out.println(n);      // first number
        num2(2);                 // call next method
    }

    static void num2(int n) {
        System.out.println(n);      // second number
        num3(3);                 // call next method
    }

    static void num3(int n) {
        System.out.println(n);      // third number
        num4(4);                 // call next method
    }

    static void num4(int n) {
        System.out.println(n);      // fourth number
        num5(5);                 // call next method
    }

    static void num5(int n) {
        System.out.println(n);  // fifth number (final)
    }
}
