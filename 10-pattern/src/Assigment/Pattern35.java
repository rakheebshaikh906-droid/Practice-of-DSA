package Assigment;

//35.    1      1
//       12    21
//       123  321
//       12344321
public class Pattern35 {
    static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n) {
        for (int i = 1; i <= n; i++) {

            // left numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // middle spaces
            int spaces = 2 * (n - i);
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }

            // right numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
