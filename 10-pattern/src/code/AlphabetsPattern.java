package code;
//print alphabets pattern
public class AlphabetsPattern {
    static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(char ch='A'; ch<'A'+i;ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
