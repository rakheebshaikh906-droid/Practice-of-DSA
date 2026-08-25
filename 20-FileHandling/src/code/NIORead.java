package code;

import java.nio.file.*;
import java.io.IOException;
import java.util.List;

public class NIORead {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("example.txt"));

        for (String line : lines) {
            System.out.println(line);
        }
    }
}
