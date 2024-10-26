package Practice_Problem.Moblile_Phone;


class Vivo extends MobilePhone {
    private String videoRecordingQuality; // Unique feature for Vivo

    public Vivo(String model, String videoRecordingQuality) {
        super("Vivo", model); // Call the parent constructor
        this.videoRecordingQuality = videoRecordingQuality; // Set the video recording quality
    }

    public void recordVideo() {
        System.out.println("Recording video in " + videoRecordingQuality + " quality on Vivo " + super.model);
    }

    @Override
    public void displayFeatures() {
        super.displayFeatures(); // Call the parent method
        System.out.println("Video Recording Quality: " + videoRecordingQuality); // Display unique feature
    }
}

