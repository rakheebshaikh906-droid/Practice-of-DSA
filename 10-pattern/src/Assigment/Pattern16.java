package Assigment;

//16.      *
//        * *
//       *   *
//      *     *
//     *       *
//      *     *
//       *   *
//        * *
//         *
public class Pattern16 {
    static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n) {

        //  Upper hollow pyramid
        for (int i = 1; i <= n; i++) {

            // leading spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // first star
            System.out.print("*");

            if (i > 1) {
                // inner hollow space
                for (int space = 1; space <= 2 * i - 3; space++) {
                    System.out.print(" ");
                }
                // second star
                System.out.print("*");
            }

            System.out.println();
        }

        //  Lower hollow inverted pyramid
        for (int i = n - 1; i >= 1; i--) {

            // leading spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // first star
            System.out.print("*");

            if (i > 1) {
                // inner hollow space
                for (int space = 1; space <= 2 * i - 3; space++) {
                    System.out.print(" ");
                }
                // second star
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
