public class Counter {
    public static int totalCount = 0;
    public int instanceCount = 0;

    public static void incrementTotalCount() {
        totalCount++;
    }

    public void incrementInstanceCount() {
        instanceCount++;
    }

    @Override
    public String toString() {
        return "Total Count: " + totalCount + "  Instance Count: " + instanceCount;
    }
}
