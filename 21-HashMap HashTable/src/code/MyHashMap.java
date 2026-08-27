package code;

import java.util.ArrayList;

public class MyHashMap<K, V> {

    // Node class
    private class Node {
        K key;
        V value;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private int size; // number of key-value pairs
    private ArrayList<Node>[] buckets;

    private static final int DEFAULT_CAPACITY = 4;
    private static final double LOAD_FACTOR = 0.75;

    // Constructor
    public MyHashMap() {
        initBuckets(DEFAULT_CAPACITY);
        size = 0;
    }

    // Initialize bucket array
    private void initBuckets(int n) {
        buckets = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }
    }

    // Hash function
    private int hashFunction(K key) {
        int hashCode = key.hashCode();
        return Math.abs(hashCode) % buckets.length;
    }

    // Search inside bucket
    private int searchInBucket(K key, int bucketIndex) {
        ArrayList<Node> bucket = buckets[bucketIndex];
        for (int i = 0; i < bucket.size(); i++) {
            if (bucket.get(i).key.equals(key)) {
                return i;
            }
        }
        return -1;
    }

    // Put method
    public void put(K key, V value) {
        int bucketIndex = hashFunction(key);
        int dataIndex = searchInBucket(key, bucketIndex);

        if (dataIndex != -1) {
            // key exists → update
            buckets[bucketIndex].get(dataIndex).value = value;
        } else {
            // new key → insert
            buckets[bucketIndex].add(new Node(key, value));
            size++;
        }

        double lambda = (1.0 * size) / buckets.length;
        if (lambda > LOAD_FACTOR) {
            rehash();
        }
    }

    // Get method
    public V get(K key) {
        int bucketIndex = hashFunction(key);
        int dataIndex = searchInBucket(key, bucketIndex);

        if (dataIndex != -1) {
            return buckets[bucketIndex].get(dataIndex).value;
        } else {
            return null;
        }
    }

    // Remove method
    public V remove(K key) {
        int bucketIndex = hashFunction(key);
        int dataIndex = searchInBucket(key, bucketIndex);

        if (dataIndex != -1) {
            Node removed = buckets[bucketIndex].remove(dataIndex);
            size--;
            return removed.value;
        } else {
            return null;
        }
    }

    // Contains Key
    public boolean containsKey(K key) {
        int bucketIndex = hashFunction(key);
        int dataIndex = searchInBucket(key, bucketIndex);
        return dataIndex != -1;
    }

    // Rehash method
    private void rehash() {
        ArrayList<Node>[] oldBuckets = buckets;
        initBuckets(oldBuckets.length * 2);
        size = 0;

        for (ArrayList<Node> bucket : oldBuckets) {
            for (Node node : bucket) {
                put(node.key, node.value);
            }
        }
    }

    public int size() {
        return size;
    }

    // Display method (for testing)
    public void display() {
        for (int i = 0; i < buckets.length; i++) {
            System.out.print("Bucket " + i + ": ");
            for (Node node : buckets[i]) {
                System.out.print("[" + node.key + " = " + node.value + "] ");
            }
            System.out.println();
        }
    }

    // Main method for testing
    public static void main(String[] args) {

        MyHashMap<String, Integer> map = new MyHashMap<>();

        map.put("Rakheeb", 90);
        map.put("Ali", 85);
        map.put("Aman", 95);
        map.put("Sara", 88);

        map.display();

        System.out.println("Get Rakheeb: " + map.get("Rakheeb"));
        System.out.println("Contains Ali: " + map.containsKey("Ali"));

        map.remove("Ali");
        System.out.println("After removing Ali:");
        map.display();
    }
}