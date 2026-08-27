package code;

public class RabinKarpAlgorithm {

    static final int d = 256; // number of characters in input alphabet

    public static void search(String text, String pattern, int prime) {

        int m = pattern.length();
        int n = text.length();

        int patternHash = 0;   // hash value for pattern
        int textHash = 0;      // hash value for text window
        int h = 1;

        // Calculate h = pow(d, m-1) % prime
        for (int i = 0; i < m - 1; i++) {
            h = (h * d) % prime;
        }

        // Calculate initial hash values
        for (int i = 0; i < m; i++) {
            patternHash = (d * patternHash + pattern.charAt(i)) % prime;
            textHash = (d * textHash + text.charAt(i)) % prime;
        }

        // Slide pattern over text
        for (int i = 0; i <= n - m; i++) {

            // If hash values match
            if (patternHash == textHash) {

                int j;
                for (j = 0; j < m; j++) {
                    if (text.charAt(i + j) != pattern.charAt(j)) {
                        break;
                    }
                }

                // If pattern found
                if (j == m) {
                    System.out.println("Pattern found at index: " + i);
                }
            }

            // Calculate next window hash
            if (i < n - m) {
                textHash = (d * (textHash - text.charAt(i) * h)
                        + text.charAt(i + m)) % prime;

                if (textHash < 0) {
                    textHash = textHash + prime;
                }
            }
        }
    }

    public static void main(String[] args) {

        String text = "ABCCDDAEFG";
        String pattern = "CDD";

        int prime = 101; // A prime number

        search(text, pattern, prime);
    }
}