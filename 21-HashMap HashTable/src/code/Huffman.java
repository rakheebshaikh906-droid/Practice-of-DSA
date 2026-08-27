package code;

import java.util.*;

public class Huffman {

    static class Node implements Comparable<Node> {

        char data;
        int freq;
        Node left;
        Node right;

        Node(char data, int freq) {
            this.data = data;
            this.freq = freq;
        }

        public int compareTo(Node other) {
            return this.freq - other.freq;
        }
    }

    Node root;
    Map<Character, String> encoder = new HashMap<>();
    Map<String, Character> decoder = new HashMap<>();


    public Huffman(String text) {

        Map<Character, Integer> freqMap = new HashMap<>();

        for (char ch : text.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        PriorityQueue<Node> pq = new PriorityQueue<>();

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            pq.add(new Node(entry.getKey(), entry.getValue()));
        }

        while (pq.size() > 1) {

            Node first = pq.poll();
            Node second = pq.poll();

            Node parent = new Node('\0', first.freq + second.freq);
            parent.left = first;
            parent.right = second;

            pq.add(parent);
        }

        root = pq.poll();

        initEncoderDecoder(root, "");
    }


    private void initEncoderDecoder(Node node, String code) {

        if (node == null) return;

        if (node.left == null && node.right == null) {

            encoder.put(node.data, code);
            decoder.put(code, node.data);
        }

        initEncoderDecoder(node.left, code + "0");
        initEncoderDecoder(node.right, code + "1");
    }


    public String encode(String text) {

        StringBuilder result = new StringBuilder();

        for (char ch : text.toCharArray()) {
            result.append(encoder.get(ch));
        }

        return result.toString();
    }


    public String decode(String text) {

        StringBuilder result = new StringBuilder();
        String temp = "";

        for (char ch : text.toCharArray()) {

            temp += ch;

            if (decoder.containsKey(temp)) {
                result.append(decoder.get(temp));
                temp = "";
            }
        }

        return result.toString();
    }


    public static void main(String[] args) {

        String text = "abbccda";

        Huffman hf = new Huffman(text);

        String encoded = hf.encode(text);

        System.out.println("Encoded: " + encoded);

        String decoded = hf.decode(encoded);

        System.out.println("Decoded: " + decoded);
    }
}