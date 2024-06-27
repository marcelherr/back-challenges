import java.util.Arrays;

public class ArrayBasics {

    public static void main(String[] args) {

        // Aufgabe 1
        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {

            numbers[i] = i + 1;
        }
        System.out.println("Erstes Array: " + Arrays.toString(numbers));

        // Aufgabe 2
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {

            sum += numbers[i];
        }
        System.out.println("Summe aller Zahlen: " + sum);

        // Aufgabe 3
        int largestNumber = 0;

        for (int number : numbers) {

            if (number > largestNumber)
                largestNumber = number;
        }
        System.out.println("Groeste Zahl: " + largestNumber);


        //Aufgabe 4
        int[] secondNumbers = new int[10];

        for (int i = 0; i < 10; i++) {

            secondNumbers[i] = i + 11;
        }

        System.out.println("Zweites Array: " + Arrays.toString(secondNumbers));


        //Aufabe 5

        int[] combinedNumbers = new int[10];

        for (int i = 0; i < 10; i++) {

            combinedNumbers[i] = numbers[i] + secondNumbers[i];
        }

        System.out.println("Summer der Komibinierten Arrays: " + Arrays.toString(combinedNumbers));
    }

}
