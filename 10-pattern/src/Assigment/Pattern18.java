package Assigment;

//18.      1
//        212
//       32123
//      4321234
//       32123
//        212
//         1
public class Pattern18 {
    static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n) {

        //  Upper half + middle row
        for (int i = 1; i <= n; i++) {

            // leading spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // print decreasing numbers (i → 1)
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // print increasing numbers (2 → i)
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }

        //  Lower half
        for (int i = n - 1; i >= 1; i--) {

            // leading spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // print decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // print increasing numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
