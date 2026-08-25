package code;

import java.nio.file.*;
import java.io.IOException;

public class NIOWrite {
    public static void main(String[] args) throws IOException {
        String content = "Hello from NIO";
        Files.write(Paths.get("example.txt"), content.getBytes());
    }
}
