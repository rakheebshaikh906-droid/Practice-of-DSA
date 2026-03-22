package Assigment;

//8.   *****
//      ****
//       ***
//        **
//         *
public class Pattern8 {
    static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for (int i = 1; i <= n; i++) {

            // print spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // print stars
            for (int j = 1; j <= (n - i + 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
