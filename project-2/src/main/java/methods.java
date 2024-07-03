public class methods {
    public static void main(String[] args) {

        int result = add(4, 5);
        double doubleResult = add(4.5, 6.0);
        System.out.println("Ergebnis int: " + result);
        System.out.println("Ergebnis double: " + doubleResult);

        double positiveN = makePositive(-25.5);
        System.out.println("Ergebnis positiv: " + positiveN);

        //bonus task
        int a = 9;
        int b = 7;
        if (a > b) {
            System.out.println("Substraktion: " + subtract(a, b));
        } else {
            System.out.println("Addition: " + add(a, b));
        }

        System.out.println("EvenOdd Check: " + checkEven(6));

        String palindromeString = "";
        System.out.println("Palindrome Check for " + palindromeString + ": " + checkPalindrome(palindromeString));
    }

    public static int add(int a, int b) {
        return a + b;

    }

    //overloading
    public static double add(double a, double b) {
        return a + b;
    }

    //subtractions
    public static int subtract(int a, int b) {
        return a - b;
    }

    // make numbers positive if they aren't
    public static double makePositive(double x) {
        if (x < 0) {
            return x * -1;
        }
        return x;
    }

    // even odd test
    public static int checkEven(int x) {
        if (x % 2 == 0) {
            return x;
        }
        return x * 2;
    }

    // palindrome
    public static boolean checkPalindrome(String s) {
        s = s.toLowerCase();
        int end = s.length() - 1;

//        //check each letter at beginning and end to see if they match
//        for (int beginning = 0; beginning < end / 2; beginning++) {
//            if (s.charAt(beginning) != s.charAt(end)) {
//                return false;
//            }
//            end--;
//        }
//        if (!s.isEmpty()) return true;
//        return false;

        //reverse the string and see if it is equal to the original string

        String reverseString = new StringBuilder(s).reverse().toString();

        if (reverseString.equals(s) && !s.isEmpty()) {
            return true;
        }
        return false;
    }


}