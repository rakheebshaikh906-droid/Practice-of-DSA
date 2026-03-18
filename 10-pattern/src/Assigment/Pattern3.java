package Assigment;

//print the pattern using loops
//3.  *****
//    ****
//    ***
//    **
//    *
public class Pattern3 {
    static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1-i;j++){
                System.out.print('*');
            }
            System.out.println();//next line
        }
    }
}
