package Assigment;

//29.    *        *
//       **      **
//       ***    ***
//       ****  ****
//       **********
//       ****  ****
//       ***    ***
//       **      **
//       *        *
public class Pattern29 {
    static void main(String[] args) {
        pattern29(5);
    }
    static void pattern29(int n) {

        // upper half
        for (int i = 1; i <= n; i++) {

            // left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // spaces in center
            for (int s = 1; s <= 2 * (n - i); s++) {
                System.out.print(" ");
            }

            // right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // lower half
        for (int i = n - 1; i >= 1; i--) {

            // left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // spaces in center
            for (int s = 1; s <= 2 * (n - i); s++) {
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
