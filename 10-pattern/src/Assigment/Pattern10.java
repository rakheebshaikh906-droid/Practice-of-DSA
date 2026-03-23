package Assigment;

//10. *********
//     *******
//      *****
//       ***
//        *
public class Pattern10 {
    static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for(int i=1;i<=n;i++){
            //print spaces
            for(int s=1;s<=i-1;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*(n-i)+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
