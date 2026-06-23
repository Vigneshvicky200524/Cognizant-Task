public class FactoryMethodDemo {

    // Product interface
    interface Vehicle {
        void start();
    }

    // Concrete Products
    static class Car implements Vehicle {
        public void start() {
            System.out.println("Car is starting...");
        }
    }

    static class Bike implements Vehicle {
        public void start() {
            System.out.println("Bike is starting...");
        }
    }

    // Factory Class
    static class VehicleFactory {

        public static Vehicle getVehicle(String type) {

            if (type.equalsIgnoreCase("Car")) {
                return new Car();
            } else if (type.equalsIgnoreCase("Bike")) {
                return new Bike();
            } else {
                return null;
            }
        }
    }

    // Main Method
    public static void main(String[] args) {

        Vehicle v1 = VehicleFactory.getVehicle("Car");
        v1.start();

        Vehicle v2 = VehicleFactory.getVehicle("Bike");
        v2.start();
    }
}