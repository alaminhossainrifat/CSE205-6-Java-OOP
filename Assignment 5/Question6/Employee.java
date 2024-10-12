package Question6;

public class Employee {
    private String name;
    private int emp_Id;
    private double basic_Salary;
    private double hra;
    private double da;

    public Employee(String name, int emp_Id, double basic_Salary) {
        this.name = name;
        this.emp_Id = emp_Id;
        this.basic_Salary = basic_Salary;
    }

    public double gross_Salary() {
        hra = 0.20 * basic_Salary;
        da = 0.10 * basic_Salary;
        return basic_Salary + hra + da;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + emp_Id);
        System.out.println("Basic Salary: " + basic_Salary);
        System.out.println("Gross Salary: " + gross_Salary());
    }
}
