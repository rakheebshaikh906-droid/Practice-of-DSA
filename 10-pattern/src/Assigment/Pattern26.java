package Assigment;

//26.       *****
//         *   *
//        *   *
//       *   *
//      *****
public class Pattern26 {
    static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n) {

        // top line
        for (int i = 0; i < n; i++) {
            System.out.print(" ");
        }
        System.out.println("*****");

        // middle 3 lines
        for (int i = 1; i <= 3; i++) {
            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j < 3; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        // bottom line
        for (int i = 0; i < n - 4; i++) {
            System.out.print(" ");
        }
        System.out.println("*****");
    }
}
