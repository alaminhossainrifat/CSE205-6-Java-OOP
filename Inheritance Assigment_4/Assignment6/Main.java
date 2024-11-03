public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus("B123", 60, "Red", "Alice", "Route 5");
        Car car = new Car("C456", 80, "Blue", "Bob", "Toyota");

        System.out.println("---- Bus Details ----");
        bus.showData();

        System.out.println("\n---- Car Details ----");
        car.showData();
    }
}
