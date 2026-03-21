package Assigment;

//6.  *
//    **
//    ***
//    ****
//    *****
//    ****
//    ***
//    **
//    *
public class Pattern6 {
    static void main(String[] args) {
        pattern6(5);
    }
    static void pattern6(int n){
        for(int i=0;i<2*n;i++){
            int totalColInRow;
            if (i>n){
                totalColInRow=2*n-i;
            }else {
                totalColInRow = i;
            }
            for(int j=0;j<totalColInRow;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
