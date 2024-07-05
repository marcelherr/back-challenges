public class Main {

    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();

        ;
        counter1.incrementTotalCount();
        counter2.incrementTotalCount();
        Counter.incrementTotalCount();

        counter1.incrementInstanceCount();
        counter2.incrementInstanceCount();
        counter2.incrementInstanceCount();


        System.out.println(counter1);
        System.out.println(counter2);
        System.out.println(Counter.totalCount);

        System.out.println(Calculator.add(4, 5));
        System.out.println(Calculator.subtraction(10, 5));
        System.out.println(Calculator.multiplication(6, 5));
        System.out.println(Calculator.division(30, 5));
    }
}
