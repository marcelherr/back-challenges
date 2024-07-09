class StringAndPrimeUtilities {

    fun reverseString(input: String): String {
        return input.reversed()
    }

    fun isPalindrome(input: String): Boolean {
        return input == reverseString(input)
    }

    fun generatePrimes(n: Int): List<Int> {
        val primes = mutableListOf<Int>()
        var num = 2 // Start with the first prime number
        while (primes.size < n) {
            if (isPrime(num)) {
                primes.add(num)
            }
            num++
        }
        return primes
    }

    fun isPrime(num: Int): Boolean {
        if (num <= 1) {
            return false
        }
        for (i in 2..Math.sqrt(num.toDouble()).toInt()) {
            if (num % i == 0) {
                return false
            }
        }
        return true
    }
}

// Main function to test the methods
fun main() {
    val utilities = StringAndPrimeUtilities()

    // Test reverseString method
    val testString = "Hello"
    println("Reversed String: ${utilities.reverseString(testString)}")

    // Test isPalindrome method
    val palindromeString = "anna"
    println("Is Palindrome: ${utilities.isPalindrome(palindromeString)}")

    // Test generatePrimes method
    val n = 10
    println("First $n prime numbers: ${utilities.generatePrimes(n)}")
}
