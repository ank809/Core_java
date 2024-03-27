// a singleton class is a class that allows only one instance
// of itself to be created, and it provides a global point of access to that instance.

package StaticExample;

public class Singleton {
    // Private static variable to hold the single instance of the class
    private static Singleton instance;

    // Private constructor to prevent external instantiation
    private Singleton() {
        // Constructor code
    }

    // Public static method to access the single instance of the class
    public static synchronized Singleton getInstance() {
        // Create the instance if it doesn't exist
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello, I am a singleton instance!");
    }

    public static void main(String[] args) {
        // Using the Singleton class
        Singleton singletonInstance = Singleton.getInstance();
        singletonInstance.showMessage();

        // Trying to create another instance (which won't work)
        Singleton anotherInstance = Singleton.getInstance();
        anotherInstance.showMessage(); // This will print the same message as before
    }
}
