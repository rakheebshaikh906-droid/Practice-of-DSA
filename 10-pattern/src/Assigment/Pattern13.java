package Assigment;

//13.  * * * * *
//      * * * *
//       * * *
//        * *
//         *
//         *
//        * *
//       * * *
//      * * * *
//     * * * * *
public class Pattern13 {
    static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for(int i=1;i<=2*n;i++){
            int spaces, stars;
            if (i <= n) {
                // Upper inverted part
                spaces = i - 1;
                stars = n - i + 1;
            } else {
                // Lower normal part
                spaces = 2 * n - i;
                stars = i - n;
            }
            // print spaces
            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }
            // print stars with space
            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
