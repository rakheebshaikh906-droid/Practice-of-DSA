package Assigment;

//33.    a
//       B c
//       D e F
//       g H i J
//       k L m N o
public class Pattern33 {
    static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n) {
        char ch = 'a'; // starting character

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                // j odd → lowercase, j even → uppercase
                if (j % 2 == 1) {
                    System.out.print(Character.toLowerCase(ch) + " ");
                } else {
                    System.out.print(Character.toUpperCase(ch) + " ");
                }

                ch++; // next character
            }

            System.out.println();
        }
    }
}
