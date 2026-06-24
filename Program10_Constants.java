public class Program10_Constants {
    public static void main(String[] args) {
        // By convention, constant names are often UPPERCASE
        final double PI = 3.14159;
        final int MAX_USERS = 100;

        System.out.println("The value of PI is: " + PI);
        System.out.println("Max allowed users: " + MAX_USERS);

        // PI = 3.14;  <-- This would cause an error because PI is final and cannot be reassigned
    }
}
