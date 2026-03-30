package Assigment;

//20.    *        *
//       **      **
//       ***    ***
//       ****  ****
//       **********
//       ****  ****
//       ***    ***
//       **      **
//       *        *
public class Pattern20 {
    static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n) {
        // Upper half
        for (int i = 1; i <= n; i++) {
            // left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // middle spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            // left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // middle spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
