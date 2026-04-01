package Assigment;

//24.        *      *
//         *   *  *   *
//       *      *      *
public class Pattern24 {
    static void main(String[] args) {
        pattern(3);
    }
    static void pattern(int n){
        for (int i = 0; i < n; i++) {

            // leading spaces
            for (int s = 0; s < (n - i) * 4; s++) {
                System.out.print(" ");
            }

            // first star
            System.out.print("*");

            // space between 1st and 2nd star
            for (int s = 0; s < i * 6; s++) {
                System.out.print(" ");
            }

            // second star
            System.out.print("*");

            // space between 2nd and 3rd star
            for (int s = 0; s < i * 6; s++) {
                System.out.print(" ");
            }

            // third star
            System.out.print("*");

            System.out.println();
        }
    }
}