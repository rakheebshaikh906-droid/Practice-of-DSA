package Assigment;

//https://leetcode.com/problems/sentence-similarity-iii/description/
//1813. Sentence Similarity III
public class SentenceSimilarity3 {
    static void main(String[] args) {
        String sentence1 = "My name is Haley",sentence2 = "My Haley"; //expected output:true
        System.out.println(areSentencesSimilar(sentence1,sentence2));
    }
    static  boolean areSentencesSimilar(String sentence1, String sentence2){
        if (sentence1.length() > sentence2.length()) {
            return areSentencesSimilar(sentence2, sentence1);
        }
        String[] small = sentence1.split(" ");
        String[] large = sentence2.split(" ");

        int start = 0;
        int end1 = small.length - 1;
        int end2 = large.length - 1;

        // prefix
        while (start <= end1 && small[start].equals(large[start])) {
            start++;
        }

        // suffix
        while (end1 >= start && small[end1].equals(large[end2])) {
            end1--;
            end2--;
        }

        return start > end1;
    }
}
