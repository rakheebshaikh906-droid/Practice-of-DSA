package assigment;

import java.util.*;

public class WordLadder {
    static void main(String[] args) {
        String beginWord="hit";
        String endWord="cog";
        List<String> wordList=new ArrayList<>();//{"hot","dot","dog","lot","log","cog"};
        wordList.add("hot");
        wordList.add("dot");
        wordList.add("dog");
        wordList.add("lot");
        wordList.add("lot");
        wordList.add("cog");

        System.out.println(ladderLength(beginWord,endWord,wordList));
    }
    static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(!wordList.contains(endWord)){
            return 0;
        }
        Set<String>visited=new HashSet<>();
        Queue<String>q=new LinkedList<>();
        q.offer(beginWord);
        int length=0;

        while(!q.isEmpty()){
            int size=q.size();
            length++;
            for(int i=0;i<size;i++){
                String current=q.poll();

                for(int j=0;j<current.length();j++){
                    char[] temp=current.toCharArray();
                    for(char c='a';c<='z';c++){
                        temp[j]=c;

                        String newWord=new String(temp);
                        if(newWord.equals(endWord)){
                            return length+1;
                        }
                        if(wordList.contains(newWord) && !visited.contains(newWord)){
                            q.offer(newWord);
                            visited.add(newWord);

                        }
                    }
                }
            }
        }
        return 0;
    }
}
