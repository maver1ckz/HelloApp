/**
 * HelloApp.java - A simple Java application that extends the functionality of
 * HelloAppUC1 by accepting a user's name as a command-line argument and displaying
 * a personalized greeting.
 *
 * @author Developer Name
 * @version 2.0
 */
public class HelloApp {
    public static void main(String[] args) {
        // Check if arguments exist before accessing them to avoid ArrayIndexOutOfBoundsException [cite: 1857, 1877-1878, 1886-1887]
        if (args.length > 0) {
            // Get the name from the first command-line argument [cite: 1849, 1856]
            String name = args[0];
            // Use string concatenation to combine the greeting and the name [cite: 1858, 1881-1883]
            System.out.println("Hello, " + name + "!");
        } else {
            // Default fallback message if no arguments are given [cite: 1888-1889]
            System.out.println("Hello, World!");
        }
    }
}