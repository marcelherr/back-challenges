public class Main {

    public static void main(String[] args) {
        // Test reverseString method
        String testString = "Hello";
        System.out.println("Reversed String: " + StringAndPrimeUtilities.reverseString(testString));

        // Test isPalindrome method
        String palindromeString = "anna";
        System.out.println("Is Palindrome: " + StringAndPrimeUtilities.isPalindrome(palindromeString));

        // Test generatePrimes method
        int n = 10;
        System.out.println("First " + n + " prime numbers: " + StringAndPrimeUtilities.generatePrimes(n));
    }
}
