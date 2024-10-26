package Practice_Problem.Moblile_Phone;



public class MobilePhoneDemo {
    public static void main(String[] args) {
        // Create instances of each mobile phone
        Samsung samsung = new Samsung("Galaxy S21", "108 MP");
        Apple apple = new Apple("iPhone 13", "A15 Bionic");
        Vivo vivo = new Vivo("V21", "4K");

        // Demonstrate Samsung features
        samsung.displayFeatures();
        samsung.takePhoto();
        samsung.makeCall("123456789");

        System.out.println();

        // Demonstrate Apple features
        apple.displayFeatures();
        apple.runApp("Safari");
        apple.sendMessage("Hello!");

        System.out.println();

        // Demonstrate Vivo features
        vivo.displayFeatures();
        vivo.recordVideo();
        vivo.playSound();
    }
}

