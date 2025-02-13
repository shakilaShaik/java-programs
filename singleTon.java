
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
