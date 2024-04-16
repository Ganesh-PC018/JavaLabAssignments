import java.io.Console;

public class MaskPassword {
    public static void main(String[] args) {
        Console console = System.console();
        if (console == null) {
            System.out.println("Console not available. Exiting...");
            return;
        }

        char[] passwordChars = console.readPassword("Enter your password: ");
        String password = new String(passwordChars);

        // Mask the password
        String maskedPassword = maskPassword(password);

        System.out.println("Your masked password: " + maskedPassword);

        // You can perform other operations with the password here
    }

    public static String maskPassword(String password) {
        // Replace all characters in the password with asterisks (*)
        return "*".repeat(password.length());
    }
}
