public class Program6_LogicalOps {
    public static void main(String[] args) {
        boolean condition1 = true;
        boolean condition2 = false;

        // Logical AND (&&): true only if both are true
        System.out.println("condition1 && condition2: " + (condition1 && condition2));

        // Logical OR (||): true if at least one is true
        System.out.println("condition1 || condition2: " + (condition1 || condition2));

        // Logical NOT (!): reverses the logical state
        System.out.println("!condition1: " + (!condition1));
    }
}
