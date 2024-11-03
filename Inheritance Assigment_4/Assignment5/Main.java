import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Box
        System.out.println("Enter length, width, height for Box:");
        Box box = new Box(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
        System.out.println("Box Surface Area: " + box.wholeSurfaceArea());
        System.out.println("Box Volume: " + box.volume());

        // Cube
        System.out.println("Enter side for Cube:");
        Cube cube = new Cube(scanner.nextDouble());
        System.out.println("Cube Surface Area: " + cube.wholeSurfaceArea());
        System.out.println("Cube Volume: " + cube.volume());

        // Cylinder
        System.out.println("Enter radius and height for Cylinder:");
        Cylinder cylinder = new Cylinder(scanner.nextDouble(), scanner.nextDouble());
        System.out.println("Cylinder Surface Area: " + cylinder.wholeSurfaceArea());
        System.out.println("Cylinder Volume: " + cylinder.volume());

        // Cone
        System.out.println("Enter radius and height for Cone:");
        Cone cone = new Cone(scanner.nextDouble(), scanner.nextDouble());
        System.out.println("Cone Surface Area: " + cone.wholeSurfaceArea());
        System.out.println("Cone Volume: " + cone.volume());

        scanner.close();
    }
}
