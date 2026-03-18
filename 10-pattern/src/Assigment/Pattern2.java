package Assigment;
//print this pattern using loop
//2.  *
//    **
//    ***
//    ****
//    *****
public class Pattern2 {
    static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print('*');
            }
            //when one row is need to printed,we need to add new line
            System.out.println();
        }
    }
}
