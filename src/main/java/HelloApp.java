/**
 * HelloApp.java - A simple Java application that greets the user by name if
 * provided as a command-line argument, or defaults to greeting "World" if no name is
 * given. This use case demonstrates how to handle optional command-line arguments and
 * provide default values in Java.
 *
 * @author Developer Name
 * @version 3.0
 */
public class HelloApp {
    public static void main(String[] args) {
        // Use a ternary operator to check if an argument exists and assign the name [cite: 1601-1603, 1610, 1647-1650, 1653-1658]
        String name = (args.length > 0) ? args[0] : "World";
        
        // Display the personalized greeting [cite: 1604, 1607]
        System.out.println("Hello, " + name + "!");
    }
}