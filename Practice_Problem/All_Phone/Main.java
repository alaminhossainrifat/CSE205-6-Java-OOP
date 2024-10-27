package Practice_Problem.All_Phone;

public class Main {
    public static void main(String[] args) {
        Samsung s = new Samsung("S20","4K");
        Apple a = new Apple("Iphone 12","A14 Bionic");

        s.display();
        s.takePhoto();

        a.display();
        a.setCpu();
    }
}
