package code;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFileExample {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello Rakheeb\n");
            writer.write("This is file handling in Java.");
            writer.close();

            System.out.println("Successfully written.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
