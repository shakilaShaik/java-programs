
public class Logger {

    // Step 1: Create a private static instance of the class
    private static Logger loggerInstance;

    // Step 2: Make the constructor private so that it cannot be instantiated directly from outside
    private Logger() {
    }

    // Step 3: Create a public static method to provide access to the single instance
    public static Logger getLoggerInstance() {
        // Step 4: Check if the instance is already created
        if (loggerInstance == null) {
            // If not, create a new instance
            loggerInstance = new Logger();
        }
        return loggerInstance;
    }

    // Method to log a message
    public void log(String message) {
        // In a real application, you might log this to a file or a database
        System.out.println("Log message: " + message);
    }
}

public class Main {

    public static void main(String[] args) {
        // Get the single instance of the Logger class
        Logger logger1 = Logger.getLoggerInstance();

        // Log a message
        logger1.log("This is the first log message.");

        // Get the same instance again
        Logger logger2 = Logger.getLoggerInstance();

        // Log another message
        logger2.log("This is the second log message.");

        // Check if both references point to the same instance
        System.out.println("Are both logger references the same? " + (logger1 == logger2));
    }
}
/*** Here’s why it's important to follow the convention:

// Naming Conventions: The variable loggerInstance is supposed to be of type Logger, as it holds the instance of the Logger class. So, you need to declare it as private static Logger loggerInstance. The variable loggerInstances might seem like it’s holding multiple instances, but the Singleton pattern is designed to hold only a single instance of the Logger class. Therefore, loggerInstance is the appropriate name for a variable that stores a single instance of the class.
// If you use private static loggerInstances, it can lead to confusion since the naming suggests that you're trying to store multiple instances, but the Singleton pattern enforces only one instance at a time.

// Data Type Consistency: The data type of the loggerInstance is Logger. If you use loggerInstances but don't change the type, the program would still work, but it would be misleading and could confuse others reading the code. The name of the variable should reflect its purpose clearly and consistently with the pattern you’re implementing.
Logger loggerInstance = new Logger();:
This creates a new local variable called loggerInstance inside the getLoggerInstance method. It's local to the method, meaning it only exists within the scope of that method. This would not change the class-level static variable loggerInstance. So every time you call getLoggerInstance(), it would create a new local variable loggerInstance and the class-level static variable would remain unchanged.

loggerInstance = new Logger();:
This line is referring to the static class-level variable loggerInstance, which was declared outside the method (at the class level). By writing loggerInstance = new Logger();, you're assigning a new instance of the Logger class to the class-level static variable loggerInstance. This ensures that the same instance is used throughout the class, and that only one instance of Logger is created (which is the essence of the Singleton pattern).Logger loggerInstance = new Logger();:
This creates a new local variable called loggerInstance inside the getLoggerInstance method. It's local to the method, meaning it only exists within the scope of that method. This would not change the class-level static variable loggerInstance. So every time you call getLoggerInstance(), it would create a new local variable loggerInstance and the class-level static variable would remain unchanged.

loggerInstance = new Logger();:
This line is referring to the static class-level variable loggerInstance, which was declared outside the method (at the class level). By writing loggerInstance = new Logger();, you're assigning a new instance of the Logger class to the class-level static variable loggerInstance. This ensures that the same instance is used throughout the class, 
and that only one instance of Logger is created (which is the essence of the Singleton pattern).
*/
