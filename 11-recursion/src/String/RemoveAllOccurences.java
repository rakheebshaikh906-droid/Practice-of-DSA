package String;

public class RemoveAllOccurences {
    static void main(String[] args) {
        String s="daabcbaabcbc";
        String part="abc";
        String ans=removeOccurrences(s,part);
        System.out.println(ans);
    }
    static String  removeOccurrences(String s, String part) {
        // base case — stop when string is too small to contain 'part'
        if (s.isEmpty()) {
            return "";
        }
        char ch=s.charAt(0);
        // if 'part' matches from start
        if (s.startsWith(part)){
            // skip exactly 'part.length()' characters
            return  removeOccurrences(s.substring(part.length()), part);
        }
        // no match — add 1st char + recurse on rest
        return ch +  removeOccurrences(s.substring(1), part);
    }
}
