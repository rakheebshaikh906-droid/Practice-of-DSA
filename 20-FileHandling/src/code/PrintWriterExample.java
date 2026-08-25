package code;

import java.io.PrintWriter;
import java.io.IOException;

public class PrintWriterExample {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("example.txt");

        pw.println("Line 1");
        pw.println("Line 2");

        pw.close();
    }
}
