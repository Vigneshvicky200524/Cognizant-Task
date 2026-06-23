public class SingletonDemo {

    // Singleton class
    static class Singleton {

        // Static variable to hold the single instance
        private static Singleton instance;

        // Private constructor prevents object creation from outside
        private Singleton() {
            System.out.println("Singleton Object Created");
        }

        // Method to return the single instance
        public static Singleton getInstance() {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }

        // Sample method
        public void display() {
            System.out.println("Hello from Singleton Pattern");
        }
    }

    // Main method
    public static void main(String[] args) {

        // Get first object
        Singleton obj1 = Singleton.getInstance();
        obj1.display();

        // Get second object
        Singleton obj2 = Singleton.getInstance();

        // Compare both references
        if (obj1 == obj2) {
            System.out.println("Both objects are the same instance.");
        } else {
            System.out.println("Different objects created.");
        }
    }
}