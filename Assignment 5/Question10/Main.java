package Question10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < employees.length; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            
            System.out.print("Employee ID: ");
            int empId = scanner.nextInt();

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Salary: ");
            double salary = scanner.nextDouble();

            employees[i] = new Employee(empId, name, salary);
        }

        System.out.println("Employee Details:");
        for (Employee employee : employees) {
            System.out.println("Employee ID: " + employee.getEmpId());
            System.out.println("Name: " + employee.getName());
            System.out.println("Salary: " + employee.getSalary());
            System.out.println("---------------------------");
        }

        scanner.close();
    }
}

