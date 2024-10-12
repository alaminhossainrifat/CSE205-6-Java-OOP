package Question6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter employee ID: ");
        int emp_Id = sc.nextInt();
        System.out.print("Enter basic salary: ");
        double basic_Salary = sc.nextDouble();

        Employee e1 = new Employee(name, emp_Id, basic_Salary);
        e1.display();

        sc.close();
    }
}
