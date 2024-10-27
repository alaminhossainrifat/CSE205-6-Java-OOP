package Practice_Problem.Car;

public class Main {
    public static void main(String[] args) {
        Tesla t = new Tesla("A205", "KW8500", 6, 7, true);
        t.display();
        t.autoDrive();

        BMW b = new BMW("B410", "B444", 4, 4, false);

        b.display();
        b.driveAssist();
    }
}
