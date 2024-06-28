public class unitTest {

    public static void main(String[] args) {
        System.out.println(addition(2, 3));
        System.out.println(isEven(4));
        System.out.println(product(5, 6));
        System.out.println(toUpperCase("test"));
        System.out.println(isPositive(-1));

    }

    public static int addition(int a, int b) {
        return a + b;
    }

    public static boolean isEven(int c) {
        return c % 2 == 0;
    }

    public static int product(int d, int e) {
        return d * e;
    }

    public static String toUpperCase(String s) {
        return s.toUpperCase();
    }

    public static boolean isPositive(int x) {
        return x > 0;
    }
}
