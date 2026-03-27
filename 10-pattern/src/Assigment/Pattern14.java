package Assigment;

//14.      *
//        * *
//       *   *
//      *     *
//     *********
public class Pattern14 {
    static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for(int i=1;i<=n;i++){
            // print leading spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // first row → only one star
            if (i == 1) {
                System.out.println("*");
                continue;
            }

            // last row → print full stars
            if (i == n) {
                for (int j = 1; j <= 2 * n - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
                continue;
            }

            // middle hollow rows
            System.out.print("*");  // left star

            // hollow space → (2*i - 3)
            for (int space = 1; space <= 2 * i - 3; space++) {
                System.out.print(" ");
            }

            System.out.print("*"); // right star
            System.out.println();
        }
    }
}
