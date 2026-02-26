package Assigment;

//https://leetcode.com/problems/jewels-and-stones/?envType=problem-list-v2&envId=string
//771. Jewels and Stones

public class JewelsAndStones {
    static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels,stones));
    }
    static int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for(int i=0;i<stones.length();i++){
            for(int j=0;j<jewels.length();j++){
                if(stones.charAt(i)==jewels.charAt(j)){
                    count+=1;
                }
            }
        }
        return count;
    }
}
