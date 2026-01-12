package assignment;

//https://leetcode.com/problems/find-words-containing-character/solutions/7488444/2942-find-words-containing-character-by-xs2tu/
//2942. Find Words Containing Character
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindWordContainsChar {
    static void main(String[] args) {
        String[] words={"leet","code"};
        char x='e';
        System.out.println(findWordsContaining(words,x));
    }
    static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer>ans=new ArrayList<>();

        for(int i=0;i< words.length;i++){
            if(words[i].contains(String.valueOf(x))){
                ans.add(i);
            }
        }
        return ans;
    }
}
