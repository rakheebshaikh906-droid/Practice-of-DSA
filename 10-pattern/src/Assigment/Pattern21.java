package Assigment;

//21.    ****
//       *  *
//       *  *
//       *  *
//       ****
public class Pattern21 {
    static void main(String[] args){
        pattern(4,4);
    }
    static void pattern(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                // first or last row => all stars
                if (i == 1 || i == rows) {
                    System.out.print("*");
                }
                // first or last column => star
                else if (j == 1 || j == cols) {
                    System.out.print("*");
                }
                // middle area => space
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
