package String;

public class SkipTheCharacter {
    static void main(String[] args) {
    skip("","baccad");
    System.out.println(InPlaceSkip("abvbshgfa"));
    System.out.println(skipString("bcdapplebgf","apple"));
    System.out.println(skipAppNotApple("bcdapplebgf","apple"));//agar string me apple raha tuh app skip nhi hunga magar string me apple nhi raha tuh woh skip hojayenga.
    }

    //skip the char that mention in the method
    static void skip(String ans,String str){
        //base case
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch=str.charAt(0);

        if (ch == 'a') {
            //skip
            skip(ans,str.substring(1));
        }else{
            //means add the character at the ans
            skip(ans+ch,str.substring(1));
        }
    }

    //return the string
    static String InPlaceSkip(String str){
        //base case
        if(str.isEmpty()){
            return"";
        }
        char ch=str.charAt(0);

        if (ch == 'a') {
            //skip
             return InPlaceSkip(str.substring(1));//increment by 1 if a is present
        }else{
            //means add the character at the ans
            return ch +InPlaceSkip(str.substring(1));//add the char that is not a and increment by 1
        }
    }

    //skip the string
    static String skipString(String str,String part){
        //base case
        if(str.isEmpty()){
            return"";
        }
        if (str.startsWith(part)) {
            //skip
            return skipString(str.substring(part.length()),part);//increment by 1 if a is present
        }else{
            //means add the character at the ans
            return str.charAt(0) + skipString(str.substring(1),part);//add the char that is not a and increment by 1
        }
    }

    //skip the app not apple if apple is present in the string answer will remain same
    static String skipAppNotApple(String str,String part){
        //base case
        if(str.isEmpty()){
            return"";
        }
        if (str.startsWith("app") && ! str.startsWith(part)) {
            //skip
            return skipAppNotApple(str.substring(3),part);//increment by 1 if a is present
        }else{
            //means add the character at the ans
            return str.charAt(0) + skipAppNotApple(str.substring(1),part);//add the char that is not a and increment by 1
        }
    }
}