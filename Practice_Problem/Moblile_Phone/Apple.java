package Practice_Problem.Moblile_Phone;

class Apple extends MobilePhone {
    private String cpuType; // Unique feature for Apple

    public Apple(String model, String cpuType) {
        super("Apple", model); // Call the parent constructor
        this.cpuType = cpuType; // Set the CPU type
    }

    public void runApp(String appName) {
        System.out.println("Running " + appName + " on " + cpuType + " CPU of Apple " + super.model);
    }

    @Override
    public void displayFeatures() {
        super.displayFeatures(); // Call the parent method
        System.out.println("CPU Type: " + cpuType); // Display unique feature
    }
}

