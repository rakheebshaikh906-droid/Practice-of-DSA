package Assigment;

//19.   **********
//      ****  ****
//      ***    ***
//      **      **
//      *        *
//      *        *
//      **      **
//      ***    ***
//      ****  ****
//      **********
public class Pattern19 {
    static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n) {

        // Upper half
        for (int i = 1; i <= n; i++) {

            int stars = n - i + 1;// decreasing stars
            int spaces = (i - 1) * 2;// increasing middle spaces

            // left stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            // middle spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // right stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        //  Lower half
        for (int i = n; i >= 1; i--) {

            int stars = n - i + 1;// increasing stars
            int spaces = (i - 1) * 2;// decreasing spaces

            // left stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            // middle spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // right stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
