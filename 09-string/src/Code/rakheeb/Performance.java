package Code.rakheeb;

public class Performance {
    static void main(String[] args) {
        //create a empty string to store a final result
        String series="";
        //loop runs 26 times from 0 to 25 times
        for(int i=0;i<26;i++){
            //generate the each character from A to Z
            char ch=(char)('A'+i);
            // Add the current character to the string
            // This can also be written as: series += ch;
            series=series+ch;
        }
        // Print the complete series of characters (A–Z)
        System.out.println(series);
    }
}
