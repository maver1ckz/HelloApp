/**
 * HelloApp - UC4 - A simple Java application that greets multiple users by name if
 * provided as command-line arguments, or defaults to greeting "World" if no names are given.
 *
 * @author Developer Name
 * @version 4.0
 */
public class HelloApp {
    public static void main(String[] args) {
        String name = "World"; // Default value [cite: 1741]
        
        // Check if arguments exist [cite: 1725]
        if (args.length > 0) {
            // Use StringBuilder to efficiently build the string from multiple parts [cite: 1746, 1787]
            StringBuilder nameBuilder = new StringBuilder();
            
            // Loop through all command-line arguments [cite: 1747, 1782-1783]
            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);
                
                // Add a comma and space if it is not the last name 
                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
            }
            name = nameBuilder.toString();
        }
        
        // Display the final personalized greeting [cite: 1729]
        System.out.println("Hello, " + name + "!");
    }
}