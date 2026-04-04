package Assigment;

//28.      *
//        * *
//       * * *
//      * * * *
//     * * * * *
//      * * * *
//       * * *
//        * *
//         *
public class Pattern28 {
    static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for(int i=0;i<2*n;i++) {
            int totalColInRow;
            if (i > n) {
                totalColInRow = 2 * n - i;
            } else {
                totalColInRow = i;
            }
            int totalSpaces=n-totalColInRow;
            //print spaces
            for(int s=0;s<totalSpaces;s++){
                System.out.print(" ");
            }
            for(int j=0;j<totalColInRow;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
