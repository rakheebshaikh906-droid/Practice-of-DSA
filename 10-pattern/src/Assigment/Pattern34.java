package Assigment;

//34.    E D C B A
//       D C B A
//       C B A
//       B A
//       A
public class Pattern34 {
    static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n) {
        for (int i = 0; i < n; i++) {

            // starting letter for the row (E, D, C, B, A)
            char start = (char) ('A' + (n - 1 - i));

            // print from start down to A
            for (char c = start; c >= 'A'; c--) {
                System.out.print(c + " ");
            }

            System.out.println();
        }
    }
}
