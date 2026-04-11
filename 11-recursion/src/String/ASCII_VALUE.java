package String;

import java.util.ArrayList;
public class ASCII_VALUE {
    static void main(String[] args) {
        // how to get ascii value
        //ascii value of 'a'
        char ch = 'a';
        System.out.println(ch + 0);

        //ascii value of 'A'
        char cha = 'A';
        System.out.println(cha + 0);

        //call the method
        subSeqAscii("", "ab");

        //call the method
        System.out.println(subSeqReturnAscii("", "ab"));

    }

    static void subSeqAscii(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        //first recursion call for take it
        subSeqAscii(p + ch, up.substring(1));
        //second recursion call for ignore it
        subSeqAscii(p, up.substring(1));
        //third recursion call for Ascii value
        subSeqAscii(p + (ch + 0), up.substring(1));
    }

    //method for returning in the string
    static ArrayList<String> subSeqReturnAscii(String p, String up) {
        // base case
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        // take it
        ArrayList<String> first = subSeqReturnAscii(p + ch, up.substring(1));

        // ignore it
        ArrayList<String> second = subSeqReturnAscii(p, up.substring(1));

        // take ASCII value
        ArrayList<String> third = subSeqReturnAscii(p + (int) ch, up.substring(1));

        // merge all lists
        first.addAll(second);
        first.addAll(third);

        return first;
    }
}