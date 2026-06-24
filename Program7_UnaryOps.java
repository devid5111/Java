public class Program7_UnaryOps {
    public static void main(String[] args) {
        int count = 10;

        // Post-increment: uses the value, then increments
        System.out.println("Original count: " + count++); // Prints 10
        System.out.println("After post-increment: " + count); // Prints 11

        // Pre-increment: increments, then uses the value
        System.out.println("Pre-increment: " + (++count)); // Prints 12

        // Decrement works similarly
        System.out.println("Pre-decrement: " + (--count)); // Prints 11
    }
}
