package Assigment;
//15.  *********
//      *     *
//       *   *
//        * *
//         *
public class Pattern15 {
    static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int s = 1; s < i; s++) {
                System.out.print(" ");
            }
            // first row → print full stars
            if (i == 1) {
                for (int j = 1; j <= 2 * n - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
                continue;
            }

            // last row (tip) → only one star
            if (i == n) {
                System.out.println("*");
                continue;
            }

            // hollow middle rows
            System.out.print("*");  // left star

            // inner spaces = (2*(n-i)+1) - 2
            int innerSpaces = (2 * (n - i) + 1) - 2;

            for (int sp = 1; sp <= innerSpaces; sp++) {
                System.out.print(" ");
            }

            System.out.print("*"); // right star
            System.out.println();
        }
    }
}
