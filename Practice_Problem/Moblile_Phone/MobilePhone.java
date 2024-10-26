package Practice_Problem.Moblile_Phone;


// Base class
class MobilePhone {
    // Common attributes for all mobile phones
    private String brand;
    protected String model;
    private boolean hasPhoneCall;
    private boolean hasMessaging;
    private boolean hasSoundSystem;

    // Constructor to initialize brand and model
    public MobilePhone(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.hasPhoneCall = true; // All mobile phones can make calls
        this.hasMessaging = true;  // All mobile phones can send messages
        this.hasSoundSystem = true; // All mobile phones have sound
    }

    // Method to make a call
    public void makeCall(String number) {
        System.out.println(brand + " " + model + " is calling " + number);
    }

    // Method to send a message
    public void sendMessage(String message) {
        System.out.println(brand + " " + model + " sent: " + message);
    }

    // Method to play sound
    public void playSound() {
        System.out.println(brand + " " + model + " is playing sound.");
    }

    // Method to display common features
    public void displayFeatures() {
        System.out.println("Features of " + brand + " " + model + ":");
        System.out.println("Phone Call: " + hasPhoneCall);
        System.out.println("Messaging: " + hasMessaging);
        System.out.println("Sound System: " + hasSoundSystem);
    }
}
