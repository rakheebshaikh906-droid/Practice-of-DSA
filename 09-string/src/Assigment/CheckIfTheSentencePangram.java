package Assigment;

//https://leetcode.com/problems/check-if-the-sentence-is-pangram/
//1832. Check if the Sentence Is Pangram

public class CheckIfTheSentencePangram {
    static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }
    static boolean checkIfPangram(String sentence) {
        return sentence.chars().distinct().count()==26;
    }
}
