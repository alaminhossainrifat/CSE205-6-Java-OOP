package Question5;

public class Student {
    private String name;
    private int rollNo;
    private int sub1;
    private int sub2;

    public void initialize(String name, int rollNo, int sub1, int sub2) {
        this.name = name;
        this.rollNo = rollNo;
        this.sub1 = sub1;
        this.sub2 = sub2;
    }

    public int TotalMarks() {
        return sub1 + sub2;
    }

    public double percentage() {
        return (TotalMarks() / 200.0) * 100;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Subject 1: " + sub1);
        System.out.println("Subject 2: " + sub2);
        System.out.println("Total Marks: " + TotalMarks());
        System.out.println("Percentage: " + percentage());
    }
}
