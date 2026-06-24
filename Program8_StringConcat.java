public class Program8_StringConcat {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        
        // Joining strings with a space in between
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);

        // Concatenating string with numbers
        int score = 95;
        System.out.println(firstName + "'s score is " + score);
    }
}
