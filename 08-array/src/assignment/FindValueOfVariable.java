package assignment;

//https://leetcode.com/problems/final-value-of-variable-after-performing-operations/description/?envType=problem-list-v2&envId=
//2011. Final Value of Variable After Performing Operations
public class FindValueOfVariable {
    static void main(String[] args) {
        String[]operations={"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(operations));
    }
    static int finalValueAfterOperations(String[] operations){
        int x=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("++X") || operations[i].equals("X++")){
                x+=1;
            }else{
                x-=1;
            }
        }
        return x;
    }
}
