package Assignment4;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        Teacher t = new Teacher();

        p.fun();
        t.fun();
        
        p = t;
        p.fun();
    }
}
