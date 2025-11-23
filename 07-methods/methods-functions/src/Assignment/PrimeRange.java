package Assignment;

import java.util.Scanner;
//Write a function that returns all
// prime numbers between two given numbers.
import java.util.ArrayList;
import java.util.List;

public class PrimeRange {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter start number: ");
        int start = in.nextInt();

        System.out.print("Enter end number: ");
        int end = in.nextInt();

        List<Integer> primes = getPrimesBetween(start, end);

        System.out.println("Prime numbers between " + start + " and " + end + " are:");
        for (int prime : primes) {
            System.out.print(prime + " ");
        }
    }

    static List<Integer> getPrimesBetween(int start, int end) {
        List<Integer> primes = new ArrayList<>();

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }

        return primes;
    }

    static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) return false;
        }

        return true;
    }
}
