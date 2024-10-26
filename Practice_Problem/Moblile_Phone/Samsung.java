package Practice_Problem.Moblile_Phone;

class Samsung extends MobilePhone {
    private String cameraQuality; // Unique feature for Samsung

    public Samsung(String model, String cameraQuality) {
        super("Samsung", model); // Call the parent constructor
        this.cameraQuality = cameraQuality; // Set the camera quality
    }

    public void takePhoto() {
        System.out.println("Taking photo with " + cameraQuality + " camera on Samsung " + super.model);
    }

    @Override
    public void displayFeatures() {
        super.displayFeatures(); // Call the parent method
        System.out.println("Camera Quality: " + cameraQuality); // Display unique feature
    }
}

