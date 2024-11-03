import java.util.Scanner;


public class Student_Main {
    public static void main(String[] args) {
        Student s1 = new Student();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name: ");
        s1.name = scanner.nextLine();
        System.out.println("Enter Age: ");
        s1.age = scanner.nextInt();
        // System.out.println("Enter Gender: ");
        // s1.gender = scanner.nextLine();
        System.out.println("Enter id: ");
        s1.id = scanner.nextInt();
        System.out.println("Enter Phone Number: ");
        s1.phone = scanner.nextInt();
        System.out.println("\n");
        s1.display();

        scanner.close();
    }
}
