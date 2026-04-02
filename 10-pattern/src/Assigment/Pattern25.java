package Assigment;

//25.    *        *
//       **      **
//       * *    * *
//       *  *  *  *
//       *   **   *
//       *   **   *
//       *  *  *  *
//       * *    * *
//       **      **
//       *        *
public class Pattern25 {
    static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n) {
        // Upper half (including middle)
        for (int i = 0; i < n; i++) {
            // left stars pattern
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // spaces between two shapes
            for (int s = 0; s < (n - i - 1) * 2; s++) {
                System.out.print(" ");
            }
            // right stars pattern
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // Lower half
        for (int i = n - 1; i >= 0; i--) {
            // left stars pattern
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // spaces between two shapes
            for (int s = 0; s < (n - i - 1) * 2; s++) {
                System.out.print(" ");
            }
            // right stars pattern
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
