package Assigment;

//11.      *
//        * *
//       * * *
//      * * * *
//     * * * * *
public class Pattern11 {
    static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for(int i=1;i<=n;i++){
            //print spaces
            for(int s=1;s<=n-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
