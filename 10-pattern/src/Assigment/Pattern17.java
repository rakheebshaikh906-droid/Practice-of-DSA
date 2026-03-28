package Assigment;

//17.           1
//            1   1
//          1   2   1
//        1   3   3   1
//      1   4   6   4   1
public class Pattern17 {
    static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n) {

        for (int i = 0; i < n; i++) {

            // print leading spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }

            int number = 1; // first number of every row is always 1

            for (int j = 0; j <= i; j++) {
                System.out.print(number + "   ");

                // formula for nCr → number = number * (i - j) / (j + 1)
                number = number * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}
