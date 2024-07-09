import java.util.ArrayList;
import java.util.List;

public class StringAndPrimeUtilities {

    // Method to reverse a given string
    public static String reverseString(String input) {
        StringBuilder reversedString = new StringBuilder(input);
        return reversedString.reverse().toString();
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String input) {
        String reversedString = reverseString(input);
        return input.equals(reversedString);
    }

    // Method to generate the first n prime numbers
    public static List<Integer> generatePrimes(int n) {
        List<Integer> primes = new ArrayList<>();
        int num = 2; // Start with the first prime number
        while (primes.size() < n) {
            if (isPrime(num)) {
                primes.add(num);
            }
            num++;
        }
        return primes;
    }

    // Helper method to check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
